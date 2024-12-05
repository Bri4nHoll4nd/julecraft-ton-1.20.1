package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JuleCraftMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LIMESTONE);
        blockWithItem(ModBlocks.LIMESTONE_1);
        blockWithItem(ModBlocks.LIMESTONE_2);
        blockWithItem(ModBlocks.LIMESTONE_3);
        blockWithItem(ModBlocks.LIMESTONE_4);
        blockWithItem(ModBlocks.LIMESTONE_5);
        blockWithItem(ModBlocks.LIMESTONE_6);
        blockWithItem(ModBlocks.LIMESTONE_7);
        blockWithItem(ModBlocks.LIMESTONE_8);
        blockWithItem(ModBlocks.LIMESTONE_9);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
