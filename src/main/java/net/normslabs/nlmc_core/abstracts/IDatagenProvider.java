/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 02:57
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public interface IDatagenProvider<TInternalProvider extends DataProvider> {
    
    NlmcRegistrar getNlmcRegistrar();
    
    TInternalProvider getInternalProvider();
    
    void onDatagen(GatherDataEvent event);
}
