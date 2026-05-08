/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 22:48
 */

package net.normslabs.nlmc_core.abstracts;


public interface INlmcObject<
        TSelf extends INlmcObject<TSelf, TDescriptor>,
        TDescriptor extends IDescriptor<TDescriptor, ?, TSelf>> {
    
    static <TSelf extends INlmcObject<TSelf, TDescriptor>,
            TDescriptor extends IDescriptor<TDescriptor, ?, TSelf>>
    TSelf create(Class<TSelf> clazz, TDescriptor descriptor) {
        try {
            return clazz.getConstructor(descriptor.getClass()).newInstance(descriptor);
            
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate ", e);
        }
    }
    
}
