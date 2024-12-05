package net.bri4nholl4nd.julecraftmod.fluid;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, JuleCraftMod.MOD_ID);

    public static final RegistryObject<FluidType> CARBONATED_WATER = registerFluidType("carbonated_water",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5a3baf8,
                    new Vector3f(163f / 255f, 186f / 255f, 248f / 255f),
                    FluidType.Properties.create().lightLevel(4)));

    public static final RegistryObject<FluidType> JULEBRUS_BROWN = registerFluidType("julebrus_brown",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA57d6a42,
                    new Vector3f(125f / 255f, 106f / 255f, 66f / 255f),
                    FluidType.Properties.create().lightLevel(4)));
    public static final RegistryObject<FluidType> JULEBRUS_ORANGE = registerFluidType("julebrus_orange",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5c18a46,
                    new Vector3f(193f / 255f, 138f / 255f, 70f / 255f),
                    FluidType.Properties.create().lightLevel(4)));
    public static final RegistryObject<FluidType> JULEBRUS_RED = registerFluidType("julebrus_red",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5cd2f43,
                    new Vector3f(205f / 255f, 47f / 255f, 67f / 255f),
                    FluidType.Properties.create().lightLevel(4)));

    public static final RegistryObject<FluidType> FRUIT_JUICE = registerFluidType("fruit_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5593f35,
                    new Vector3f(89f / 255f, 63f / 255f, 53f / 255f),
                    FluidType.Properties.create().lightLevel(4)));
    public static final RegistryObject<FluidType> ORANGE_JUICE = registerFluidType("orange_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5bd933e,
                    new Vector3f(189f / 255f, 147f / 255f, 62f / 255f),
                    FluidType.Properties.create().lightLevel(4)));
    public static final RegistryObject<FluidType> SWEET_BERRY_JUICE = registerFluidType("sweet_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA5a21a2b,
                    new Vector3f(162f / 255f, 26f / 255f, 43f / 255f),
                    FluidType.Properties.create().lightLevel(4)));



    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
