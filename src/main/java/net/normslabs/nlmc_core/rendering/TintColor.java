/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 18:41
 */

package net.normslabs.nlmc_core.rendering;


import net.normslabs.nlmc_core.utils.Color;

public class TintColor {
    private final int tintIndex;
    private final Color color;
    
    public TintColor(int tintIndex, Color color) {
        this.tintIndex = tintIndex;
        this.color = color;
    }
    
    public int getTintIndex() {
        return this.tintIndex;
    }
    
    public Color getColor() {
        return this.color;
    }
}
