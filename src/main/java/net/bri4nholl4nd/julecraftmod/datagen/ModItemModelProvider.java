package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JuleCraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LIME_POWDER);
        simpleItem(ModItems.ORANGE);
        simpleItem(ModItems.BIO_PULP);
        simpleItem(ModItems.PLASTIC_NUGGET);
        simpleItem(ModItems.PLASTIC_SHEET);
        simpleItem(ModItems.GLASS_SODA_BOTTLE);
        simpleItem(ModItems.PLASTIC_SODA_BOTTLE);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_ORANGE);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_RED);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_BROWN);
        simpleItem(ModItems.CARBONATED_WATER_BUCKET);
        simpleItem(ModItems.JULEBRUS_BROWN_BUCKET);
        simpleItem(ModItems.JULEBRUS_ORANGE_BUCKET);
        simpleItem(ModItems.JULEBRUS_RED_BUCKET);
        simpleItem(ModItems.FRUIT_JUICE_BUCKET);
        simpleItem(ModItems.ORANGE_JUICE_BUCKET);
        simpleItem(ModItems.BIOETHANOL_BUCKET);
        simpleItem(ModItems.SWEET_BERRY_JUICE_BUCKET);

        saplingItem(ModBlocks.ORANGE_SAPLING);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(JuleCraftMod.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(JuleCraftMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
