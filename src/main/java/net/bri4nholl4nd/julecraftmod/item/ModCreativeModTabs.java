package net.bri4nholl4nd.julecraftmod.item;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLASS_BOTTLE.get()))
                    .title(Component.translatable("creativetab.julecraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COMPRESSED_LIMESTONE_1X.get());
                        pOutput.accept(ModItems.LIME_POWDER.get());
                        pOutput.accept(ModItems.BIO_PULP.get());
                        pOutput.accept(ModItems.PLASTIC_SHEET.get());
                        pOutput.accept(ModItems.PLASTIC_BOTTLE.get());
                        pOutput.accept(ModItems.GLASS_BOTTLE.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_ORANGE.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_RED.get());
                        pOutput.accept(ModItems.BOTTLE_OF_JULE_BRUS_BROWN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
