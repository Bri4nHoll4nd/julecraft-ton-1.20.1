package net.bri4nholl4nd.julecraftmod.item;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JuleCraftMod.MOD_ID);

    public static final RegistryObject<Item> GLASS_SODA_BOTTLE = ITEMS.register("glass_soda_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIME_POWDER = ITEMS.register("lime_powder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIO_PULP = ITEMS.register("bio_pulp",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC_SHEET = ITEMS.register("plastic_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC_SODA_BOTTLE = ITEMS.register("plastic_soda_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_ORANGE = ITEMS.register("bottle_of_julebrus_orange",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_RED = ITEMS.register("bottle_of_julebrus_red",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_JULE_BRUS_BROWN = ITEMS.register("bottle_of_julebrus_brown",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARBONATED_WATER_BUCKET = ITEMS.register("carbonated_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CARBONATED_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> JULEBRUS_BROWN_BUCKET = ITEMS.register("julebrus_brown_bucket",
            () -> new BucketItem(ModFluids.SOURCE_JULEBRUS_BROWN, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> JULEBRUS_ORANGE_BUCKET = ITEMS.register("julebrus_orange_bucket",
            () -> new BucketItem(ModFluids.SOURCE_JULEBRUS_ORANGE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> JULEBRUS_RED_BUCKET = ITEMS.register("julebrus_red_bucket",
            () -> new BucketItem(ModFluids.SOURCE_JULEBRUS_RED, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> FRUIT_JUICE_BUCKET = ITEMS.register("fruit_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FRUIT_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> ORANGE_JUICE_BUCKET = ITEMS.register("orange_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ORANGE_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE_BUCKET = ITEMS.register("sweet_berry_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEET_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
