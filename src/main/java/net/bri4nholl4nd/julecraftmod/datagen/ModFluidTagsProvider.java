package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.fluid.ModFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagsProvider extends FluidTagsProvider {
    public ModFluidTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, JuleCraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(FluidTags.WATER)
                .add(ModFluids.SOURCE_CARBONATED_WATER.get())
                .add(ModFluids.FLOWING_CARBONATED_WATER.get())
                .add(ModFluids.SOURCE_JULEBRUS_BROWN.get())
                .add(ModFluids.FLOWING_JULEBRUS_BROWN.get())
                .add(ModFluids.SOURCE_JULEBRUS_ORANGE.get())
                .add(ModFluids.FLOWING_JULEBRUS_ORANGE.get())
                .add(ModFluids.SOURCE_JULEBRUS_RED.get())
                .add(ModFluids.FLOWING_JULEBRUS_RED.get())
                .add(ModFluids.SOURCE_FRUIT_JUICE.get())
                .add(ModFluids.FLOWING_FRUIT_JUICE.get())
                .add(ModFluids.SOURCE_ORANGE_JUICE.get())
                .add(ModFluids.FLOWING_ORANGE_JUICE.get())
                .add(ModFluids.SOURCE_SWEET_BERRY_JUICE.get())
                .add(ModFluids.FLOWING_SWEET_BERRY_JUICE.get());
    }
}
