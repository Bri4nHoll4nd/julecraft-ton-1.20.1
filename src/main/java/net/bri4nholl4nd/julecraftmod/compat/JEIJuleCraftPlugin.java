package net.bri4nholl4nd.julecraftmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIJuleCraftPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(JuleCraftMod.MOD_ID, "jei_plugin");
    }
}
