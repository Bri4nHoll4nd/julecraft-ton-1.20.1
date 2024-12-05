package net.bri4nholl4nd.julecraftmod.fluid;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.bri4nholl4nd.julecraftmod.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, JuleCraftMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_CARBONATED_WATER = FLUIDS.register("carbonated_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.CARBONATED_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CARBONATED_WATER = FLUIDS.register("flowing_carbonated_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CARBONATED_WATER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties CARBONATED_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.CARBONATED_WATER, SOURCE_CARBONATED_WATER, FLOWING_CARBONATED_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.CARBONATED_WATER_BLOCK).bucket(ModItems.CARBONATED_WATER_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_JULEBRUS_BROWN = FLUIDS.register("julebrus_brown_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.JULEBRUS_BROWN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_JULEBRUS_BROWN = FLUIDS.register("flowing_julebrus_brown_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.JULEBRUS_BROWN_PROPERTIES));
    public static final ForgeFlowingFluid.Properties JULEBRUS_BROWN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.JULEBRUS_BROWN, SOURCE_JULEBRUS_BROWN, FLOWING_JULEBRUS_BROWN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.JULEBRUS_BROWN_BLOCK).bucket(ModItems.JULEBRUS_BROWN_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_JULEBRUS_ORANGE = FLUIDS.register("julebrus_orange_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.JULEBRUS_ORANGE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_JULEBRUS_ORANGE = FLUIDS.register("flowing_julebrus_orange_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.JULEBRUS_ORANGE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties JULEBRUS_ORANGE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.JULEBRUS_ORANGE, SOURCE_JULEBRUS_ORANGE, FLOWING_JULEBRUS_ORANGE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.JULEBRUS_ORANGE_BLOCK).bucket(ModItems.JULEBRUS_ORANGE_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_JULEBRUS_RED = FLUIDS.register("julebrus_red_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.JULEBRUS_RED_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_JULEBRUS_RED = FLUIDS.register("flowing_julebrus_red_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.JULEBRUS_RED_PROPERTIES));
    public static final ForgeFlowingFluid.Properties JULEBRUS_RED_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.JULEBRUS_RED, SOURCE_JULEBRUS_RED, FLOWING_JULEBRUS_RED)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.JULEBRUS_RED_BLOCK).bucket(ModItems.JULEBRUS_RED_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_FRUIT_JUICE = FLUIDS.register("fruit_juice_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FRUIT_JUICE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FRUIT_JUICE = FLUIDS.register("flowing_fruit_juice_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FRUIT_JUICE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties FRUIT_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.FRUIT_JUICE, SOURCE_FRUIT_JUICE, FLOWING_FRUIT_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.FRUIT_JUICE_BLOCK).bucket(ModItems.FRUIT_JUICE_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_ORANGE_JUICE = FLUIDS.register("orange_juice_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ORANGE_JUICE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ORANGE_JUICE = FLUIDS.register("flowing_orange_juice_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ORANGE_JUICE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties ORANGE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ORANGE_JUICE, SOURCE_ORANGE_JUICE, FLOWING_ORANGE_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.ORANGE_JUICE_BLOCK).bucket(ModItems.ORANGE_JUICE_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_SWEET_BERRY_JUICE = FLUIDS.register("sweet_berry_juice_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SWEET_BERRY_JUICE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SWEET_BERRY_JUICE = FLUIDS.register("flowing_sweet_berry_juice_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SWEET_BERRY_JUICE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties SWEET_BERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SWEET_BERRY_JUICE, SOURCE_SWEET_BERRY_JUICE, FLOWING_SWEET_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.SWEET_BERRY_JUICE_BLOCK).bucket(ModItems.SWEET_BERRY_JUICE_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
