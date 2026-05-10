/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-10 05:50
 */

package net.normslabs.nlmc_core.utils;


public class BooleanUtils {
    
    public static boolean and(boolean... boolValues) {
        for (boolean bool : boolValues) {
            if (!bool) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean or(boolean... boolValues) {
        for (boolean bool : boolValues) {
            if (bool) {
                return true;
            }
        }
        return false;
    }
    
}
