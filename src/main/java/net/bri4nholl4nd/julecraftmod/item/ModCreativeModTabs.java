package net.bri4nholl4nd.julecraftmod.item;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JuleCraftMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JULECRAFT_TAB = CREATIVE_MODE_TABS.register("julecraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLASS_SODA_BOTTLE.get()))
                    .title(Component.translatable("creativetab.julecraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.LIMESTONE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_1.get());
                        pOutput.accept(ModBlocks.LIMESTONE_2.get());
                        pOutput.accept(ModBlocks.LIMESTONE_3.get());
                        pOutput.accept(ModBlocks.LIMESTONE_4.get());
                        pOutput.accept(ModBlocks.LIMESTONE_5.get());
                        pOutput.accept(ModBlocks.LIMESTONE_6.get());
                        pOutput.accept(ModBlocks.LIMESTONE_7.get());
                        pOutput.accept(ModBlocks.LIMESTONE_8.get());
                        pOutput.accept(ModBlocks.LIMESTONE_9.get());
                        pOutput.accept(ModItems.LIME_POWDER.get());
                        pOutput.accept(ModItems.ORANGE.get());
                        pOutput.accept(ModItems.BIO_PULP.get());
                        pOutput.accept(ModItems.PLASTIC_SHEET.get());
                        pOutput.accept(ModItems.PLASTIC_SODA_BOTTLE.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_ORANGE.get());
                        pOutput.accept(ModItems.GLASS_SODA_BOTTLE.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_RED.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_BROWN.get());
                        pOutput.accept(ModItems.CARBONATED_WATER_BUCKET.get());
                        pOutput.accept(ModItems.JULEBRUS_BROWN_BUCKET.get());
                        pOutput.accept(ModItems.JULEBRUS_ORANGE_BUCKET.get());
                        pOutput.accept(ModItems.JULEBRUS_RED_BUCKET.get());
                        pOutput.accept(ModItems.FRUIT_JUICE_BUCKET.get());
                        pOutput.accept(ModItems.ORANGE_JUICE_BUCKET.get());
                        pOutput.accept(ModItems.SWEET_BERRY_JUICE_BUCKET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
