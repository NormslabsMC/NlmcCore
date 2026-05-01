/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 18:32
 */

package net.normslabs.nlmc_core.rendering;


import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.normslabs.nlmc_core.abstracts.IObjectColor;
import net.normslabs.nlmc_core.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class NlmcItemColor implements ItemColor, IObjectColor {
    private final List<TintColor> layerColors;
    
    public NlmcItemColor() {
        this.layerColors = new ArrayList<>();
    }
    
    @Override
    public boolean needsRegistration() {
        return !this.layerColors.isEmpty();
    }
    
    @Override
    public List<TintColor> getLayerColors() {
        return this.layerColors;
    }
    
    @Override
    public void addTintColor(int tintIndex, Color color) {
        this.layerColors.add(new TintColor(tintIndex, color));
    }
    
    @Override
    public int getColor(ItemStack itemStack, int tintIndex) {
        for (TintColor tintColor : this.layerColors) {
            if (tintColor.getTintIndex() == tintIndex) {
                return tintColor.getColor().toTintIntValue();
            }
        }
        return -1;
    }
    
    @Override
    public boolean equals(IObjectColor otherColor) {
        if (this.getClass() != otherColor.getClass()) {
            return false;
        }
        for (TintColor tintColor : this.layerColors) {
            for (TintColor otherTintColor : otherColor.getLayerColors()) {
                if (tintColor.getTintIndex() != otherTintColor.getTintIndex() || tintColor.getColor() != otherTintColor.getColor()) {
                    return false;
                }
            }
        }
        return true;
    }
}
