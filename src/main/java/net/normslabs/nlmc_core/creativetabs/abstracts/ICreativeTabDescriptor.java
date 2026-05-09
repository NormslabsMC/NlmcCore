/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 09:03
 */

package net.normslabs.nlmc_core.creativetabs.abstracts;


import net.minecraft.world.item.CreativeModeTab;
import net.normslabs.nlmc_core.abstracts.*;
import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;

public interface ICreativeTabDescriptor<
        TSelf extends ICreativeTabDescriptor<TSelf, TBuilder, TRegistrar>,
        TBuilder extends IBuilder<TBuilder, TSelf>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, CreativeModeTab>>
        extends IMcRegistrable<TSelf, TRegistrar, CreativeModeTab, CreativeModeTab>,
        IHasDisplayedName,
        IHasItemIcon,
        IBuildable<TSelf, TBuilder> {

}
