/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 20:59
 */

package net.normslabs.nlmc_core.abstracts;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

public abstract class BuildableV3<
        TSelf extends BuildableV3<TSelf, TBuilder>,
        TBuilder extends BuilderV3<TBuilder, TSelf>>
        extends AbstractSelfReferencing<TSelf>
        implements IBuildableV3<TSelf, TBuilder> {
    
    private boolean isBuilt;
    private final Queue<Consumer<TSelf>> preBuildActions;
    private final Queue<Consumer<TSelf>> postBuildActions;
    
    protected BuildableV3() {
        this.preBuildActions = new ArrayDeque<>();
        this.postBuildActions = new ArrayDeque<>();
        this.isBuilt = false;
    }
    
    @Override
    public boolean isBuilt() {
        return this.isBuilt;
    }
    
    @Override
    public void setIsBuilt(boolean isBuilt) {
        this.isBuilt = isBuilt;
    }
    
    @Override
    public Queue<Consumer<TSelf>> getPreBuildActions() {
        return this.postBuildActions;
    }
    
    @Override
    public void registerPreBuildAction(Consumer<TSelf> buildableConsumer) {
        if (this.isBuilt()) {
            throw new IllegalStateException("Cannot register a pre build action to a buildable that has already been built.");
        }
        this.preBuildActions.add(buildableConsumer);
    }
    
    @Override
    public Queue<Consumer<TSelf>> getPostBuildActions() {
        return this.preBuildActions;
    }
    
    @Override
    public void registerPostBuildAction(Consumer<TSelf> buildableConsumer) {
        if (this.isBuilt()) {
            buildableConsumer.accept(this.self());
        } else {
            this.postBuildActions.add(buildableConsumer);
        }
    }
    
    @Override
    public abstract void validateForBuild();
    
    @Override
    public abstract TBuilder getBuilder();
    
}
