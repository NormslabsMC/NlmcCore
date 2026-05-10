/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 22:24
 */

package net.normslabs.nlmc_core.blocks.properties;


import net.normslabs.nlmc_core.blocks.BlockDescriptor;

public class BlockWorldgenProperties {
    
    private final BlockDescriptor<?,?,?> parentDescriptor;
    
    public BlockWorldgenProperties(BlockDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
}
