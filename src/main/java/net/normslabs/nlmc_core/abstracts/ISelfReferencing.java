/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 19:59
 */

package net.normslabs.nlmc_core.abstracts;


public interface ISelfReferencing<TSelf extends ISelfReferencing<TSelf>> {
    
    TSelf self();
    
}
