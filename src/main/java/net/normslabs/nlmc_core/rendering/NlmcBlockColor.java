/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 18:32
 */

package net.normslabs.nlmc_core.rendering;


import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.normslabs.nlmc_core.abstracts.IObjectColor;
import net.normslabs.nlmc_core.utils.Color;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NlmcBlockColor implements BlockColor, IObjectColor {
    private final List<TintColor> layerColors;
    
    public NlmcBlockColor() {
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
    
    @Override
    public int getColor(BlockState blockState, @Nullable BlockAndTintGetter tintGetter, @Nullable BlockPos blockPos,
                        int blockStateTintIndex) {
        for (TintColor tintColor : this.layerColors) {
            if (tintColor.getTintIndex() == blockStateTintIndex) {
                return tintColor.getColor().toTintIntValue();
            }
        }
        return -1;
    }
}
