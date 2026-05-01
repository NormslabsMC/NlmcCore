/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 22:53
 */

package net.normslabs.nlmc_core.translations;


public enum Locales {
    
    ENGLISH_US("en-us"),
    ENGLISH_CANADA("en-ca"),
    FRENCH_FRANCE("fr-fr"),
    FRENCH_CANADA("fr-ca"),
    SPANISH_SPAIN("es-es"),
    PORTUGUESE_BRAZIL("pt-br"),
    ITALIAN_ITALY("it-it"),
    GERMAN_GERMANY("de-de"),
    RUSSIAN_RUSSIA("ru-ru"),
    JAPANESE_JAPAN("ja-jp"),
    KOREAN_SOUTH_KOREA("ko-kr"),
    CHINESE_CHINA("zh-cn"),
    HINDI_INDIA("hi-in"),
    ARABIC_SAUDI_ARABIA("ar-sa"),
    BENGALI_BANGLADESH("bn-bd"),
    PUNJABI_INDIA("pa-in");
    
    private final String value;
    
    private Locales(String value) {
        this.value = sanitizeLocaleString(value);
    }
    
    public static String sanitizeLocaleString(String value) {
        return value.trim().toLowerCase().replace('_', '-');
    }
    
    public static Locales fromString(String value) {
        return valueOf(sanitizeLocaleString(value));
    }
    
    public String getCode() {
        return this.value;
    }
}
