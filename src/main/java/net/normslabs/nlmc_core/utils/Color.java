/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:10
 */

package net.normslabs.nlmc_core.utils;

import net.normslabs.nlmc_core.NlmcCore;
import net.normslabs.nlmc_core.exceptions.InvalidArgumentException;

/**
 *
 * TODO: complete documentation
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-04-30 17:10
 */
public class Color {
    
    //<editor-fold defaultstate="collapsed" desc="COLOR VALUES">
    
    public static Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    // METALS
    public static Color ALUMINUM = new Color("#E1E5E5");
    public static Color COPPER = new Color("#f17a66");
    public static Color IRON = new Color("#C4C9C9");
    public static Color GOLD = new Color("#f9ec4e");
    public static Color ZINC = new Color("#AFC8A0");
    public static Color TIN = new Color("#A6B7C5");
    public static Color NICKEL = new Color("#E4E2B3");
    public static Color CHROMIUM = new Color("#B9C3C3");
    public static Color SILVER = new Color("#C9DBDB");
    public static Color LEAD = new Color("#90A4FF");
    public static Color SILICON = new Color("#A1A5F0");
    public static Color PLATINUM = new Color("#A1F0FF");
    public static Color OSMIUM = new Color("#BAB7F1");
    public static Color SULFUR = new Color("#F8E263");
    public static Color THORIUM = new Color("#A4A9A9");
    public static Color URANIUM = new Color("#BEFF9E");
    public static Color IRIDIUM = new Color("#C1C8CC");
    public static Color LITHIUM = new Color("#E7D0BD");
    public static Color TITANIUM = new Color("#83A3FF");
    public static Color COBALT = new Color("#CACAC6");
    public static Color TUNGSTEN = new Color("#8E8B95");
    public static Color VANADIUM = new Color("#CAE5D8");
    public static Color NEPTUNIUM = new Color("#76D8AD");
    public static Color RADIUM = new Color("#D9F5A6");
    public static Color PLUTONIUM = new Color("#DCE288");
    public static Color NETHERITE_SCRAP = new Color("#6F3A3A");
    public static Color DESH = new Color("#F89C55");
    public static Color OSTRUM = new Color("#B276A4");
    public static Color CALORITE = new Color("#D15968");
    public static Color JUPERIUM = new Color("#62BBF6");
    public static Color SATURLYTE = new Color("#9C62EE");
    public static Color ELECTROLYTE = new Color("#4A51B4");
    
    // ALLOYS
    public static Color NETHERITE = new Color("#3C3838");
    public static Color STEEL = new Color("#707070");
    public static Color BRASS = new Color("#E7C16E");
    public static Color BRONZE = new Color("#D8AB73");
    public static Color CONSTANTAN = new Color("#E09970");
    public static Color INVAR = new Color("#D1CEC0");
    public static Color ELECTRUM = new Color("#E9E595");
    public static Color ANDESITE_ALLOY = new Color("#A4B7A8");
    public static Color DIORITE_ALLOY = new Color("#CCCBCB");
    public static Color GRANITE_ALLOY = new Color("#B98485");
    public static Color ALPHA_TITANIUM = new Color("#507EFD");
    public static Color PLASTANIUM = new Color("#86F17F");
    public static Color CAST_IRON = new Color("#4E4E4F");
    public static Color NECROMIUM = new Color("#1EE3F0");
    public static Color LUMIUM = new Color("#FFDA90");
    public static Color SIGNALUM = new Color("#E4680F");
    public static Color SIGNAR = new Color("#c37e48");
    public static Color ENDERIUM = new Color("#165B54");
    public static Color VOID_STEEL = new Color("#1C745D");
    public static Color RED_ALLOY = new Color("#CC3A29");
    public static Color QUARTZ_IRON = new Color("#BEC5C5");
    public static Color NETHERSTEEL = new Color("#594547");
    public static Color DESHTRUM = new Color("#746266");
    
    // GEMS
    public static Color EMERALD = new Color("#51d975");
    public static Color DIAMOND = new Color("#61dbd5");
    public static Color REDSTONE = new Color("#ab1b09");
    public static Color LAPIS = new Color("#264389");
    public static Color AMETHYST = new Color("#9966CC");
    public static Color QUARTZ = new Color("#FFFCF5");
    public static Color SAPPHIRE = new Color("#0F52BA");
    public static Color RUBY = new Color("#E0115F");
    public static Color PERIDOT = new Color("#B4C424");
    
    // OTHERS
    public static Color COAL = new Color("#1F1A1A");
    public static Color CHARCOAL = new Color("#190c01");
    public static Color NETHERRACK = new Color("#700200");
    public static Color CLAY = new Color("#A4A8B8");
    public static Color DIRT = new Color("#976D4D");
    public static Color STONE = new Color("#707070");
    public static Color WOOD = new Color("#8F7748");
    public static Color SAND = new Color("#F7E9A3");
    public static Color GLOWSTONE = new Color("#FFB755");
    public static Color PRISMARINE = new Color("#63988d");
    public static Color PURPUR = new Color("#a679a6");
    public static Color END_STONE = new Color("#dddfa5");
    public static Color ICE = new Color("#7dadff");
    public static Color COKE = new Color("#4B4B4B");
    public static Color GRAPHITE = new Color("#4B4B4B");
    public static Color PLASTIC = new Color("#F3F3E9");
    
    //</editor-fold>
    
    
    public static final int MAX_RGC_INT_VALUE = 255;
    public static final int MIN_RGB_INT_VALUE = 0;
    public static final int MAX_HUE_VALUE = 360;
    public static final int MIN_HUE_VALUE = 0;
    public static final int MAX_SATURATION_VALUE = 1;
    public static final int MIN_SATURATION_VALUE = 0;
    public static final int MAX_LIGHTNESS_VALUE = 1;
    public static final int MIN_LIGHTNESS_VALUE = 0;
    public static final int MIN_ALPHA_VALUE = 0;
    public static final int MAX_ALPHA_VALUE = 127;
    public static final int DEFAULT_ALPHA_VALUE = 127;
    
    private String rgbHexString;
    private String rgbaHexString;
    private String hslHexString;
    private String hslaHexString;
    
    private int redValue;
    private int greenValue;
    private int blueValue;
    
    private float hueValue;
    private float saturationValue;
    private float lightnessValue;
    
    private int alphaValue;
    
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    Color(String rgbHexString) {
        
        rgbHexString = rgbHexString.replace("#", "");
        try {
            if (rgbHexString.length() < 6) {
                throw new InvalidArgumentException("rgbHexString", String.format("Sanitized hex string argument [%s] must be at least %d characters long.", rgbHexString, 6));
            }
            
            this.redValue = Integer.valueOf(rgbHexString.substring(0, 2), 16);
            this.greenValue = Integer.valueOf(rgbHexString.substring(2, 4), 16);
            this.blueValue = Integer.valueOf(rgbHexString.substring(4, 6), 16);
            
            if (rgbHexString.length() == 8) {
                this.alphaValue = Integer.valueOf(rgbHexString.substring(6, 8), 16);
            } else {
                this.alphaValue = DEFAULT_ALPHA_VALUE;
            }
            
            this.rgbHexString = this.numValueToHexString(this.redValue)
                                + this.numValueToHexString(this.greenValue)
                                + this.numValueToHexString(this.blueValue);
            this.rgbaHexString = this.numValueToHexString(this.alphaValue) + this.rgbHexString;
            this.setHSLfromRGB(this.redValue, this.greenValue, this.blueValue);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid RGB/RGBA hex string argument passed to Color constructor", ex);
        }
    }
    
    Color(int red, int green, int blue) {
        this(red, green, blue, DEFAULT_ALPHA_VALUE);
    }
    
    Color(int red, int green, int blue, int alpha) {
        try {
            try {
                validateColorRgbIntValue(red);
            } catch (Exception ex) {
                throw new InvalidArgumentException("red", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", red), ex);
            }
            try {
                validateColorRgbIntValue(green);
            } catch (Exception ex) {
                throw new InvalidArgumentException("green", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", green), ex);
            }
            try {
                validateColorRgbIntValue(blue);
            } catch (Exception ex) {
                throw new InvalidArgumentException("blue", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", blue), ex);
            }
            try {
                validateColorAlphaValue(alpha);
            } catch (Exception ex) {
                throw new InvalidArgumentException("alpha", String.format("Invalid 'alpha' integer argument [%d] passed to Color constructor", alpha), ex);
            }
            this.redValue = red;
            this.greenValue = green;
            this.blueValue = blue;
            this.alphaValue = alpha;
            this.rgbHexString = this.numValueToHexString(red) + this.numValueToHexString(green) + this.numValueToHexString(blue);
            this.rgbaHexString = this.numValueToHexString(alpha) + this.rgbHexString;
            
            this.setHSLfromRGB(red, green, blue);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid argument passed to Color constructor", ex);
        }
    
    }
    
    Color(float hue, float saturation, float lightness) {
        this(hue, saturation, lightness, DEFAULT_ALPHA_VALUE);
    }
    
    Color(float hue, float saturation, float lightness, int alpha) {
        try {
            try {
                validateHueValue(hue);
            } catch (Exception ex) {
                throw new InvalidArgumentException("hue", String.format("Invalid 'hue' integer argument [%f] passed to Color constructor", hue), ex);
            }
            try {
                validateSaturationValue(saturation);
            } catch (Exception ex) {
                throw new InvalidArgumentException("saturation", String.format("Invalid 'saturation' integer argument [%f] passed to Color constructor", saturation), ex);
            }
            try {
                validateLightnessValue(lightness);
            } catch (Exception ex) {
                throw new InvalidArgumentException("lightness", String.format("Invalid 'lightness' integer argument [%f] passed to Color constructor", lightness), ex);
            }
            try {
                validateColorAlphaValue(alpha);
            } catch (Exception ex) {
                throw new InvalidArgumentException("alpha", String.format("Invalid 'alpha' int argument [%d] passed to Color constructor", alpha), ex);
            }
            this.hueValue = hue;
            this.saturationValue = saturation;
            this.lightnessValue = lightness;
            this.alphaValue = alpha;
            this.rgbHexString = this.hueValueToHexString(hue)
                                + this.saturationValueToHexString(saturation)
                                + this.lightnessValueToHexString(lightness);
            this.rgbaHexString = this.rgbHexString + this.numValueToHexString(alpha);
            
            this.setRGBfromHSL(hue, saturation, lightness);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid argument passed to Color constructor", ex);
        }
        
    }
    
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
    
    public int getRedValue() {
        return this.redValue;
    }
    
    public int getGreenValue() {
        return this.greenValue;
    }
    
    public int getBlueValue() {
        return this.blueValue;
    }
    
    public float getHueValue() {
        return this.hueValue;
    }
    
    public float getSaturationValue() {
        return this.saturationValue;
    }
    
    public float getLightnessValue() {
        return this.lightnessValue;
    }
    
    public int getAlphaValue() {
        return this.alphaValue;
    }
    
    //</editor-fold>
    
    
    
    public int toTintIntValue() {
        return Integer.valueOf(this.rgbaHexString, 16);
    }
    
    public Color lightenBy(float percentage) {
        return new Color(this.hueValue, this.saturationValue, (this.lightnessValue * (1 + percentage)), this.alphaValue);
    }
    
    public Color darkenBy(float percentage) {
        return new Color(this.hueValue, this.saturationValue, (this.lightnessValue * (1 - percentage)), this.alphaValue);
    }
    
    private String numValueToHexString(int value) throws InvalidArgumentException {
        this.validateColorRgbIntValue(value);
        return String.format("%02x", value);
    }
    
    private String hueValueToHexString(float hueValue) throws InvalidArgumentException {
        this.validateHueValue(hueValue);
        return String.format("%02x", Math.round((hueValue / 360) * 255));
    }
    
    private String saturationValueToHexString(float saturationValue) throws InvalidArgumentException {
        this.validateSaturationValue(saturationValue);
        return String.format("%02x", Math.round(saturationValue * 255));
    }
    
    private String lightnessValueToHexString(float lightnessValue) throws InvalidArgumentException {
        this.validateSaturationValue(lightnessValue);
        return String.format("%02x", Math.round(lightnessValue * 255));
    }
    
    private void setHSLfromRGB(int red, int green, int blue) throws InvalidArgumentException {
        
        float redFloat = red / 255.f;
        float greenFloat = green / 255.f;
        float blueFloat = blue / 255.f;
        float max = Math.max(Math.max(redFloat, greenFloat), blueFloat);
        float min = Math.min(Math.min(redFloat, greenFloat), blueFloat);
        float minMaxDifferential = max - min;
        
        float baseHue = 0.f;
        if (minMaxDifferential == 0) {
            baseHue = 0;
        } else if (max == redFloat) {
            baseHue = (greenFloat-blueFloat) / minMaxDifferential;
            if (baseHue < 0) baseHue += 6.f;
        } else if (max == greenFloat) {
            baseHue = (blueFloat-redFloat) / minMaxDifferential + 2.f;
        } else if (max == blueFloat) {
            baseHue = (redFloat-greenFloat) / minMaxDifferential + 4.f;
        }
        
        float hue = 60.f * baseHue;
        float lightness = (max + min) * 0.5f;
        float saturation;
        
        if (minMaxDifferential == 0) {
            saturation = 0.f;
        } else {
            saturation = minMaxDifferential / (1 - Math.abs(2.f * lightness - 1.f));
        }
        
        this.hueValue = hue;
        this.saturationValue = saturation;
        this.lightnessValue = lightness;
        this.hslHexString = this.hueValueToHexString(hue)
                            + this.saturationValueToHexString(saturation)
                            + this.lightnessValueToHexString(lightness);
        this.hslaHexString = this.numValueToHexString(this.alphaValue) + this.hslHexString;
    }
    
    private void setRGBfromHSL(float hue, float saturation, float lightness) throws InvalidArgumentException {
        float qValue, pValue;
        int red, green, blue;
        
        if (saturation == 0) {
            red = green = blue = Math.round(lightness * 255); // achromatic
        } else {
            qValue = lightness < 0.5 ? (lightness * (1 + saturation)) : (lightness + saturation - lightness * saturation);
            pValue = 2 * lightness - qValue;
            red = Math.round(hue2rgb(pValue, qValue, hue + 1.0f / 3) * 255);
            green = Math.round(hue2rgb(pValue, qValue, hue) * 255);
            blue = Math.round(hue2rgb(pValue, qValue, hue - 1.0f / 3) * 255);
        }
        
        this.redValue = red;
        this.greenValue = green;
        this.blueValue = blue;
        this.rgbHexString = this.numValueToHexString(red) + this.numValueToHexString(green) + this.numValueToHexString(blue);
        this.rgbaHexString = this.numValueToHexString(this.alphaValue) + this.rgbHexString;
    
    }
    
    private static float hue2rgb(float pValue, float qValue, float hue) {
        if (hue < 0) {
            hue += 1;
        }
        if (hue > 1) {
            hue -= 1;
        }
        if (6 * hue < 1) {
            return pValue + ((qValue - pValue) * 6 * hue);
        }
        if (2 * hue < 1) {
            return qValue;
        }
        if (3 * hue < 2) {
            return pValue + ((qValue - pValue) * 6 * ((2.0f / 3.0f) - hue));
        }
        
        return pValue;
    }
    
    private void validateColorRgbIntValue(int value) throws InvalidArgumentException {
        if (value < MIN_RGB_INT_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color integer value %d is lower than the minimum %d.", value,
                                                                      MIN_RGB_INT_VALUE));
        }
        if (value > MAX_RGC_INT_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color integer value %d is greater than the maximum %d.", value,
                                                                      MAX_RGC_INT_VALUE));
        }
    }
    private void validateColorAlphaValue(int alphaValue) throws InvalidArgumentException {
        if (alphaValue < MIN_ALPHA_VALUE) {
            throw new InvalidArgumentException("alphaValue", String.format("Color alpha value [%d] is lower than the minimum %d.", alphaValue,
                                                                          MIN_ALPHA_VALUE));
        }
        if (alphaValue > MAX_ALPHA_VALUE) {
            throw new InvalidArgumentException("alphaValue", String.format("Color alpha value [%d] is greater than the maximum %d.", alphaValue,
                                                                          MAX_ALPHA_VALUE));
        }
    }
    private void validateHueValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_HUE_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color hue value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_HUE_VALUE));
        }
        if (Math.round(value) > MAX_HUE_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color hue value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_HUE_VALUE));
        }
    }
    private void validateSaturationValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_SATURATION_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color saturation value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_SATURATION_VALUE));
        }
        if (Math.round(value) > MAX_SATURATION_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color saturation value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_SATURATION_VALUE));
        }
    }
    private void validateLightnessValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_LIGHTNESS_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color lightness value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_LIGHTNESS_VALUE));
        }
        if (Math.round(value) > MAX_LIGHTNESS_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color lightness value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_LIGHTNESS_VALUE));
        }
    }
    
    private void logColorData() {
        NlmcCore.LOGGER.debug("RGBA [{} , {} , {} , {}].", this.redValue, this.greenValue, this.blueValue,
                              this.alphaValue);
        NlmcCore.LOGGER.debug("HSLA [{} , {} , {} , {}].", this.hueValue, this.saturationValue, this.lightnessValue,
                              this.alphaValue);
        NlmcCore.LOGGER.debug("RGBA HEX string [{}].", this.rgbaHexString);
        NlmcCore.LOGGER.debug("HSLA HEX string [{}].", this.hslaHexString);
        
    }
    
}