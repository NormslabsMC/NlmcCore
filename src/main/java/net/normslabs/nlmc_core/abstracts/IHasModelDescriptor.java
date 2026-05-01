/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:47
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.items.abstracts.IItemModelDescriptor;

public interface IHasModelDescriptor<TMcObject, TObjectColor extends IObjectColor> {
    
    public IModelDescriptor<TMcObject, TObjectColor> getModelDescriptor();
    
    void setModelDescriptor(IModelDescriptor<TMcObject, TObjectColor> modelDescriptor);
    
}
