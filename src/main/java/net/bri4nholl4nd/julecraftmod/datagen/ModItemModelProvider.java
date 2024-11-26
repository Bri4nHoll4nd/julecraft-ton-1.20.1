package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
        simpleItem(ModItems.GLASS_SODA_BOTTLE);
        simpleItem(ModItems.PLASTIC_SODA_BOTTLE);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_ORANGE);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_RED);
        simpleItem(ModItems.BOTTLE_OF_JULE_BRUS_BROWN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(JuleCraftMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
