/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 19:21
 */

package net.normslabs.nlmc_core.utils;


public class TemperatureUtils {
    
    
    /**
     * 0°C in Kelvins
     */
    public static int ZERO_CELSIUS_IN_KELVINS = 273;
    /**
     * 25°C in Kelvins
     */
    public static int STANDARD_TEMP_IN_KELVINS = 298; // 25°C
    /**
     * 100°C in Kelvins
     */
    public static int WATER_BOILING_TEMP_IN_KELVINS = 373; // 100°C
    /**
     * 600°C in Kelvins
     */
    public static int NOHEAT_TEMP_LIMIT_IN_KELVINS = 873; // 600°C
    /**
     * 1500°C in Kelvins
     */
    public static int HEATED_TEMP_LIMIT_IN_KELVINS = 1773; // 1500°C
    /**
     * 3000°C in Kelvins
     */
    public static int SUPERHEATED_TEMP_LIMIT_IN_KELVINS = 3273; // 3000°C
    /**
     * 5000°C in Kelvins
     */
    public static int INDUSTRIAL_BLASTING_TEMP_LIMIT_IN_KELVINS = 5273; // 5000°C
    
    public static final int DEFAULT_SOLID_TEMPERATURE = STANDARD_TEMP_IN_KELVINS;
    public static final int DEFAULT_FLUID_TEMPERATURE = STANDARD_TEMP_IN_KELVINS;
    public static final int DEFAULT_MOLTEN_TEMPERATURE = HEATED_TEMP_LIMIT_IN_KELVINS;
    public static final int DEFAULT_GAS_TEMPERATURE = STANDARD_TEMP_IN_KELVINS;
    
    public static final int TEMPERATURE_TO_SET_FIRE = 473; // 200°C
    
    public static int KelvinToCelsius(int kelvin) {
        return kelvin - ZERO_CELSIUS_IN_KELVINS;
    }
    
    public static int CelsiusToKelvin(int celsius) {
        return celsius + ZERO_CELSIUS_IN_KELVINS;
    }
}
