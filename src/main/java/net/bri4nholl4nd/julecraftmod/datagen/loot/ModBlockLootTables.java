package net.bri4nholl4nd.julecraftmod.datagen.loot;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
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
        this.dropSelf(ModBlocks.ORANGE_SAPLING.get());

        this.add(ModBlocks.ORANGE_LEAVES.get(), block ->
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.ORANGE_SAPLING.get())
                                        .when(ExplosionCondition.survivesExplosion())
                                        .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, NORMAL_LEAVES_SAPLING_CHANCES[0], NORMAL_LEAVES_SAPLING_CHANCES[1], NORMAL_LEAVES_SAPLING_CHANCES[2]))))
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.ORANGE.get())
                                        .when(ExplosionCondition.survivesExplosion())
                                        .when(LootItemRandomChanceCondition.randomChance(0.15f)))));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JuleCraftMod.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
