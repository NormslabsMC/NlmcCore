/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 20:59
 */

package net.normslabs.nlmc_core.abstracts;


import java.util.Queue;
import java.util.function.Consumer;

public interface IBuildable<
        TSelf extends IBuildable<TSelf, TBuilder>,
        TBuilder extends IBuilder<TBuilder, TSelf>>
        extends ISelfReferencing<TSelf> {
    
    boolean isBuilt();
    
    void setIsBuilt(boolean isBuilt);
    
    Queue<Consumer<TSelf>> getPostBuildActions();
    
    void registerPreBuildAction(Consumer<TSelf> buildableConsumer);
    
    Queue<Consumer<TSelf>> getPreBuildActions();
    
    void registerPostBuildAction(Consumer<TSelf> buildableConsumer);
    
    void validateForBuild();
    
    TBuilder getBuilder();
    
    void onBuild();
    
}
