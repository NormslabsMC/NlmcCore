/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 23:20
 */

package net.normslabs.nlmc_core.utils.functions;


@FunctionalInterface
public interface BiConstructor<TCreated, TArg1, TArg2> {
    TCreated create(TArg1 arg1, TArg2 arg2);
}
