/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 02:42
 */

package net.normslabs.nlmc_core.items.properties;


public class ItemFuelProperties {
    private final int burnTimeInTicks;
    
    public ItemFuelProperties(int burnTimeInTicks) {
        this.burnTimeInTicks = burnTimeInTicks;
    }
    
    public int getBurnTimeInTicks() {
        return this.burnTimeInTicks;
    }
    
}
