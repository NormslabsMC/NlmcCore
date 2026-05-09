/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 02:36
 */

package net.normslabs.nlmc_core.abstracts;


/**
 * Interface for buildable descriptor objects that describe minecraft/forge internal objects.
 *
 * @param <TSelf> Self-reference to the concrete implementing type
 * @param <TBuilder> The type of the builder of the descriptor object
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 02:17
 */
public interface IDescriptor<
        TSelf extends IDescriptor<TSelf, TBuilder>,
        TBuilder extends IBuilder<TBuilder, TSelf>>
        extends IBuildable<TSelf, TBuilder> {
    
}
