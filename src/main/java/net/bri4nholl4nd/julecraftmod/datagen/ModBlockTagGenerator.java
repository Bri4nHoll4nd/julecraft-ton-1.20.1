package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JuleCraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.LIMESTONE.get(),
                        ModBlocks.LIMESTONE_1.get(),
                        ModBlocks.LIMESTONE_2.get(),
                        ModBlocks.LIMESTONE_3.get(),
                        ModBlocks.LIMESTONE_4.get(),
                        ModBlocks.LIMESTONE_5.get(),
                        ModBlocks.LIMESTONE_6.get(),
                        ModBlocks.LIMESTONE_7.get(),
                        ModBlocks.LIMESTONE_8.get(),
                        ModBlocks.LIMESTONE_9.get()
                );
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
