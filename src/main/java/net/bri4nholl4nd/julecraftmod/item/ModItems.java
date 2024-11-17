package net.bri4nholl4nd.julecraftmod.item;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JuleCraftMod.MOD_ID);

    public static final RegistryObject<Item> GLASS_BOTTLE = ITEMS.register("glass_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_LIMESTONE_1X = ITEMS.register("limestone_1x",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_POWDER = ITEMS.register("lime_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIO_PULP = ITEMS.register("bio_pulp",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC_SHEET = ITEMS.register("plastic_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC_BOTTLE = ITEMS.register("plastic_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_ORANGE = ITEMS.register("bottle_of_julebrus_orange",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_RED = ITEMS.register("bottle_of_julebrus_red",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_BROWN = ITEMS.register("bottle_of_julebrus_brown",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
