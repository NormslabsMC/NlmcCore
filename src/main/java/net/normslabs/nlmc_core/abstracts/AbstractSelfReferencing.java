/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 21:11
 */

package net.normslabs.nlmc_core.abstracts;


public abstract class AbstractSelfReferencing<
        TSelf extends AbstractSelfReferencing<TSelf>>
        implements ISelfReferencing<TSelf> {
    
    @Override
    @SuppressWarnings("unchecked")
    public final TSelf self() {
        return (TSelf) this;
    }
}
