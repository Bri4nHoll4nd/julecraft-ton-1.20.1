package net.bri4nholl4nd.julecraftmod.datagen.loot;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_1.get());
        this.dropSelf(ModBlocks.LIMESTONE_2.get());
        this.dropSelf(ModBlocks.LIMESTONE_3.get());
        this.dropSelf(ModBlocks.LIMESTONE_4.get());
        this.dropSelf(ModBlocks.LIMESTONE_5.get());
        this.dropSelf(ModBlocks.LIMESTONE_6.get());
        this.dropSelf(ModBlocks.LIMESTONE_7.get());
        this.dropSelf(ModBlocks.LIMESTONE_8.get());
        this.dropSelf(ModBlocks.LIMESTONE_9.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JuleCraftMod.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
