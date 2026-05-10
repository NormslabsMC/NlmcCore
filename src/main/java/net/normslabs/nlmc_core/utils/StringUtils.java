/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-20 03:07
 */

package net.normslabs.nlmc_core.utils;

public class StringUtils {
    
    public static String identifierToDisplayName(String identifier) {
        return capitalizeEachWord(replaceUnderscoresWithSpaces(identifier));
    }
    
    public static String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
    
    public static String capitalizeEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder(capitalize(words[0]));
        for (int i = 1; i < words.length; i++) {
            sb.append(" ")
              .append(capitalize(words[i]));
        }
        return sb.toString();
    }
    
    public static String replaceUnderscoresWithSpaces(String input) {
        return input.replace('_', ' ');
    }
    
    public static String replaceSlashesWithUnderscores(String input) {
        return input.replace('/', '_').replace('\\', '_');
    }
    
    public static int countOccurrencesOfSubstring(String input, String substring) {
        int lastIndex = 0;
        int count = 0;
        
        while (lastIndex != -1) {
            lastIndex = input.indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substring.length();
            }
        }
        return count;
    }
    
}