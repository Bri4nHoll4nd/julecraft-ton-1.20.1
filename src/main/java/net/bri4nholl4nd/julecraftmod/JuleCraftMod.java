package net.bri4nholl4nd.julecraftmod;

import com.mojang.logging.LogUtils;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.bri4nholl4nd.julecraftmod.fluid.ModFluidTypes;
import net.bri4nholl4nd.julecraftmod.fluid.ModFluids;
import net.bri4nholl4nd.julecraftmod.item.ModCreativeModTabs;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JuleCraftMod.MOD_ID)
public class JuleCraftMod {
    public static final String MOD_ID = "julecraft_taste_of_norway";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JuleCraftMod.MOD_ID);
    private static final Logger LOGGER = LogUtils.getLogger();

    public JuleCraftMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_CARBONATED_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_CARBONATED_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_JULEBRUS_BROWN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_JULEBRUS_BROWN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_JULEBRUS_ORANGE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_JULEBRUS_ORANGE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_JULEBRUS_RED.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_JULEBRUS_RED.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FRUIT_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FRUIT_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ORANGE_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ORANGE_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SWEET_BERRY_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SWEET_BERRY_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BIOETHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BIOETHANOL.get(), RenderType.translucent());
        }
    }
}
