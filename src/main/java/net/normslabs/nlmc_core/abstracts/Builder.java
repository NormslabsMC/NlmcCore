/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 20:59
 */

package net.normslabs.nlmc_core.abstracts;


import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;
import java.util.function.Consumer;

public abstract class Builder<
        TSelf extends Builder<TSelf, TBuilt>,
        TBuilt extends Buildable<TBuilt, TSelf>>
        extends AbstractSelfReferencing<TSelf>
        implements IBuilder<TSelf, TBuilt> {
    
    protected TBuilt buildable;
    private final Queue<Consumer<TBuilt>> preBuildActions;
    private final Queue<Consumer<TBuilt>> postBuildActions;
    
    protected Builder(TBuilt initialBuildable) {
        if (initialBuildable.isBuilt()) {
            throw new IllegalStateException("Cannot build a buildable that has already been built.");
        }
        this.buildable = initialBuildable;
        this.preBuildActions = new ArrayDeque<>();
        this.postBuildActions = new ArrayDeque<>();
    }
    
    @Override
    public TSelf registerPreBuildAction(Consumer<TBuilt> buildableConsumer) {
        if (this.buildable.isBuilt()) {
            throw new IllegalStateException("Cannot register a pre build action to a builder of a buildable that has already been built.");
        }
        this.preBuildActions.add(buildableConsumer);
        return this.self();
    }
    
    @Override
    public TSelf registerPostBuildAction(Consumer<TBuilt> buildableConsumer) {
        if (this.buildable.isBuilt()) {
            buildableConsumer.accept(this.buildable);
        } else {
            this.postBuildActions.add(buildableConsumer);
        }
        return this.self();
    }
    
    @Override
    public TBuilt build() {
        if (this.buildable.isBuilt()) {
            throw new IllegalStateException("Cannot build a buildable that has already been built.");
        }
        this.buildable.validateForBuild();
        while (!this.buildable.getPreBuildActions().isEmpty()) {
            Optional.ofNullable(this.buildable.getPreBuildActions().poll())
                    .ifPresent((action) -> action.accept(this.buildable));
        }
        while (this.preBuildActions.peek() != null) {
            this.preBuildActions.poll().accept(this.buildable);
        }
        this.buildable.onBuild();
        this.buildable.setIsBuilt(true);
        while (!this.buildable.getPostBuildActions().isEmpty()) {
            Optional.ofNullable(this.buildable.getPostBuildActions().poll())
                    .ifPresent((action) -> action.accept(this.buildable));
        }
        while (this.postBuildActions.peek() != null) {
            this.postBuildActions.poll().accept(this.buildable);
        }
        return this.buildable;
    }
    
}
