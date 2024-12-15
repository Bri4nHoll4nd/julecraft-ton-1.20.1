package net.bri4nholl4nd.julecraftmod.block;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.fluid.ModFluids;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.bri4nholl4nd.julecraftmod.worldgen.tree.OrangeTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_1 = registerBlock("limestone_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_2 = registerBlock("limestone_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_3 = registerBlock("limestone_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_4 = registerBlock("limestone_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_5 = registerBlock("limestone_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_6 = registerBlock("limestone_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_7 = registerBlock("limestone_7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_8 = registerBlock("limestone_8",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_9 = registerBlock("limestone_9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<LiquidBlock> CARBONATED_WATER_BLOCK = JuleCraftMod.BLOCKS.register("carbonated_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CARBONATED_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> JULEBRUS_BROWN_BLOCK = JuleCraftMod.BLOCKS.register("julebrus_brown_block",
            () -> new LiquidBlock(ModFluids.SOURCE_JULEBRUS_BROWN, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> JULEBRUS_ORANGE_BLOCK = JuleCraftMod.BLOCKS.register("julebrus_orange_block",
            () -> new LiquidBlock(ModFluids.SOURCE_JULEBRUS_ORANGE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> JULEBRUS_RED_BLOCK = JuleCraftMod.BLOCKS.register("julebrus_red_block",
            () -> new LiquidBlock(ModFluids.SOURCE_JULEBRUS_RED, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> FRUIT_JUICE_BLOCK = JuleCraftMod.BLOCKS.register("fruit_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FRUIT_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> ORANGE_JUICE_BLOCK = JuleCraftMod.BLOCKS.register("orange_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ORANGE_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> SWEET_BERRY_JUICE_BLOCK = JuleCraftMod.BLOCKS.register("sweet_berry_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEET_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> BIOETHANOL_BLOCK = JuleCraftMod.BLOCKS.register("bioethanol_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BIOETHANOL, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
    });
    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlock("orange_sapling",
            () -> new SaplingBlock(new OrangeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = JuleCraftMod.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        JuleCraftMod.BLOCKS.register(eventBus);
    }
}
