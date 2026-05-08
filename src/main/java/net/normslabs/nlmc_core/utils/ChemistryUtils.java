/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:51
 */

package net.normslabs.nlmc_core.utils;


import net.normslabs.nlmc_core.contents.ChemicalElements;

import java.util.HashMap;
import java.util.Map;

public class ChemistryUtils {
    
    /**
     * Compares two chemical compound formulas and returns whether they are
     * equivalent in termes of element count.
     *
     * @param formula1 The first formula
     * @param formula2 the second formula
     * @return true if the formulas are equivalent, false otherwise.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-01 20:33
     */
    public static boolean areFormulasEquivalent(String formula1, String formula2) {
        Map<ChemicalElements, Integer> formula1Components = parseFormula(formula1);
        Map<ChemicalElements, Integer> formula2Components = parseFormula(formula2);
        if (formula1Components.size() != formula2Components.size()) {
            return false;
        }
        for (Map.Entry<ChemicalElements, Integer> entry : formula1Components.entrySet()) {
            if (!formula2Components.containsKey(entry.getKey())) {
                return false;
            }
            if (entry.getValue().intValue() != formula2Components.get(entry.getKey()).intValue()) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Parses a stoichiometric chemical formula (e.g. {@code C8H10N4O2}, {@code (NH4)3PO4}) and returns a map of
     * {@link ChemicalElements} to their atom counts. The parser supports nested parentheses and element
     * multiplicities. Element symbols must match entries in {@link ChemicalElements} (standard 1–2 letter symbols).
     * <p>
     * Rules/assumptions:
     * - Element symbol: one uppercase letter followed by an optional lowercase letter (e.g. H, He, Fe, Og).
     * - Count: one or more digits following an element or a right parenthesis. If omitted, defaults to 1.
     * - Parentheses: groups may be wrapped in '(' and ')', followed by an optional count that multiplies the
     *   group's internal element counts. Nested parentheses are supported.
     * - Whitespace is ignored.
     * </p>
     * <code>
     * Examples:
     * - {@code C8H10N4O2} -> C=8, H=10, N=4, O=2
     * - {@code (NH4)3PO4} -> N=1*3 + P=1, H=4*3, O=4
     * </code>
     *
     * @param formula The chemical formula as a string.
     * @return A map of elements to their total counts in the formula.
     * @throws IllegalArgumentException If the formula is null/empty, contains unknown element symbols,
     *                                  has invalid syntax, or unbalanced parentheses.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-01 18:53
     */
    public static Map<ChemicalElements, Integer> parseFormula(String formula) {
        if (formula == null) {
            throw new IllegalArgumentException("Formula cannot be null.");
        }
        String input = formula.trim();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Formula cannot be empty.");
        }
        int[] idx = new int[] {0};
        Map<ChemicalElements, Integer> result = parseGroup(input, idx, false);
        skipSpaces(input, idx);
        if (idx[0] != input.length()) {
            throw new IllegalArgumentException("Unexpected trailing content at position " + idx[0] + " in formula '" + formula + "'");
        }
        return result;
    }
    
    // Parses a sequence of tokens until the end (when stopAtRightParen=false) or until a ')' (when true).
    private static Map<ChemicalElements, Integer> parseGroup(String s, int[] idx, boolean stopAtRightParen) {
        Map<ChemicalElements, Integer> map = new HashMap<>();
        while (true) {
            skipSpaces(s, idx);
            if (idx[0] >= s.length()) {
                if (stopAtRightParen) {
                    throw new IllegalArgumentException("Unbalanced parentheses: missing ')' before end of input.");
                }
                break;
            }
            char c = s.charAt(idx[0]);
            if (c == ')') {
                if (!stopAtRightParen) {
                    throw new IllegalArgumentException("Unexpected ')' at position " + idx[0] + ".");
                }
                // Caller will consume ')'
                break;
            } else if (c == '(') {
                // Parse sub-group
                idx[0]++; // consume '('
                Map<ChemicalElements, Integer> inner = parseGroup(s, idx, true);
                // Expect a ')'
                if (idx[0] >= s.length() || s.charAt(idx[0]) != ')') {
                    throw new IllegalArgumentException("Unbalanced parentheses: missing ')' matching '(' at position " + (idx[0] - 1) + ".");
                }
                idx[0]++; // consume ')'
                int mult = readNumber(s, idx);
                multiplyAndMerge(map, inner, mult);
            } else if (Character.isUpperCase(c)) {
                ChemicalElements element = readElement(s, idx);
                int count = readNumber(s, idx);
                map.merge(element, count, Integer::sum);
            } else if (Character.isWhitespace(c)) {
                idx[0]++;
            } else {
                throw new IllegalArgumentException("Invalid character '" + c + "' at position " + idx[0] + ".");
            }
        }
        return map;
    }
    
    private static void multiplyAndMerge(Map<ChemicalElements, Integer> target, Map<ChemicalElements, Integer> src, int mult) {
        if (mult <= 0) {
            throw new IllegalArgumentException("Invalid multiplicity " + mult + "; must be >= 1.");
        }
        for (Map.Entry<ChemicalElements, Integer> e : src.entrySet()) {
            int added = Math.multiplyExact(e.getValue(), mult); // throws on overflow
            // throws on overflow
            target.merge(e.getKey(), added, Math::addExact);
        }
    }
    
    private static ChemicalElements readElement(String s, int[] idx) {
        // Precondition: current char is uppercase
        int start = idx[0]++;
        // Accept at most one lowercase letter after the uppercase
        if (idx[0] < s.length() && Character.isLowerCase(s.charAt(idx[0]))) {
            idx[0]++;
        }
        String symbol = s.substring(start, idx[0]);
        ChemicalElements el = ChemicalElements.fromSymbol(symbol);
        if (el == null) {
            throw new IllegalArgumentException("Unknown element symbol '" + symbol + "' at position " + start + ".");
        }
        return el;
    }
    
    private static int readNumber(String s, int[] idx) {
        skipSpaces(s, idx);
        int start = idx[0];
        int n = 0;
        boolean hasDigits = false;
        while (idx[0] < s.length() && Character.isDigit(s.charAt(idx[0]))) {
            hasDigits = true;
            int d = s.charAt(idx[0]) - '0';
            // n = n*10 + d with overflow check
            n = Math.addExact(Math.multiplyExact(n, 10), d);
            idx[0]++;
        }
        return hasDigits ? n : 1;
    }
    
    private static void skipSpaces(String s, int[] idx) {
        while (idx[0] < s.length() && Character.isWhitespace(s.charAt(idx[0]))) {
            idx[0]++;
        }
    }
}
