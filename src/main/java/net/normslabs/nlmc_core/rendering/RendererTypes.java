/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:24
 */

package net.normslabs.nlmc_core.rendering;

/**
 * Enumeration of minecraft-supported renderer types.
 * <ul>
 *     <li>{@link RendererTypes#SOLID SOLID}: The opaque minecraft default used for most blocks.</li>
 *     <li>{@link RendererTypes#CUTOUT CUTOUT}: Used for blocks with layers that should only render parts of the texture (ores).</li>
 *     <li>{@link RendererTypes#CUTOUT_MIPMAPS CUTOUT_MIPMAPS}: Same as CUTOUT but with mipmaps for long-distance rendering (leaves).</li>
 *     <li>{@link RendererTypes#TRANSLUCENT TRANSLUCENT}: Used for blocks with opacity levels (glass panes).</li>
 *     <li>{@link RendererTypes#TRIPWIRE TRIPWIRE}: Special case for tripwire-like blocks.</li>
 * </ul>
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-04-30 17:24
 */
public enum RendererTypes {
    SOLID("minecraft:solid"), // solid blocks, completely opaque
    CUTOUT("minecraft:cutout"), // with partially transparent layers, like ores
    CUTOUT_MIPMAPS("minecraft:cutout_mipped"), // cutout, but with mipmaps for leaves and such
    TRANSLUCENT("minecraft:translucent"), // for glass and such
    TRIPWIRE("minecraft:tripwire"); // special case for tripwires
    
    private final String type;
    
    RendererTypes(String type) {
        this.type = type;
    }
    
    /**
     * Returns the renderer type string that can be used with
     * {@link net.minecraftforge.client.model.generators.ModelBuilder#renderType(String) ModelBuilder.renderType(String)}
     * in block state data generators.
     *
     * @return the renderer type string.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2025-07-20 00:52
     */
    public String getType() {
        return this.type;
    }
}

