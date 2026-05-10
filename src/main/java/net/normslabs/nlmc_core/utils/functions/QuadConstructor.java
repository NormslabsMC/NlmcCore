/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 23:20
 */

package net.normslabs.nlmc_core.utils.functions;


@FunctionalInterface
public interface QuadConstructor<TCreated, TArg1, TArg2, TArg3, TArg4> {
    TCreated create(TArg1 arg1, TArg2 arg2, TArg3 arg3, TArg4 arg4);
}
