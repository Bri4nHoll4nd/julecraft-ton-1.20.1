package net.bri4nholl4nd.julecraftmod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class JuleCraftModClient {
    public static void setupItemVar() {
        JuleCraftMod.BLOCKS.getEntries().forEach(entry -> ItemBlockRenderTypes.setRenderLayer(entry.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent()));
    }
}
