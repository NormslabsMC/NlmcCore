/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-04 20:59
 */

package net.normslabs.nlmc_core.abstracts;


import java.util.function.Consumer;

public interface IBuilderV3<
        TSelf extends IBuilderV3<TSelf, TBuilt>,
        TBuilt extends IBuildableV3<TBuilt, TSelf>>
        extends ISelfReferencing<TSelf> {
    
    /**
     * Fluent method that registers a pre-build action to execute early on when the
     * {@link IBuilderV3#build build()} method is called.
     *
     * @param buildableConsumer A {@link Consumer} function that receives the {@link IBuildableV3 buildable} object.
     * @return the builder instance
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-06 21:26
     */
    TSelf registerPreBuildAction(Consumer<TBuilt> buildableConsumer);
    
    /**
     * Fluent method that registers a post-build action to execute late when the
     * {@link IBuilderV3#build build()} method is called.
     *
     * @param buildableConsumer A {@link Consumer} function that receives the {@link IBuildableV3 buildable} object.
     * @return the builder instance
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-06 21:30
     */
    TSelf registerPostBuildAction(Consumer<TBuilt> buildableConsumer);
    
    /**
     * Final method of builders. Finalizes the build process of the {@link IBuildableV3 buildable} object.
     * <p>
     * In order, it:
     * <ul>
     *     <li>Checks that the buildable's build state is not built already with its
     *     {@link IBuildableV3#validateForBuild validateForBuild()} method.</li>
     *     <li>Executes the buildable's {@link IBuildableV3#getPreBuildActions pre-build actions}.</li>
     *     <li>Executes the builder's pre-build actions.</li>
     *     <li>Calls the buildable's {@link IBuildableV3#onBuild onBuild()} method.</li>
     *     <li>Sets the buildable's build state as built.</li>
     *     <li>Executes the buildable's {@link IBuildableV3#getPostBuildActions post-build actions}.</li>
     *     <li>Executes the builder's post-build actions.</li>
     *     <li>Returns the finalized buildable.</li>
     * </ul>
     *
     * @return the finalized buildable object.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-06 21:30
     */
    TBuilt build();
    
}
