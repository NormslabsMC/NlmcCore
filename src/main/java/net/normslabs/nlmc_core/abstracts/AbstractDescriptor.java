/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 23:47
 */

package net.normslabs.nlmc_core.abstracts;


public abstract class AbstractDescriptor<
        TSelf extends AbstractDescriptor<TSelf, TBuilder>,
        TBuilder extends Builder<TBuilder, TSelf>>
        extends Buildable<TSelf, TBuilder>
        implements IDescriptor<TSelf, TBuilder> {
    
    
}
