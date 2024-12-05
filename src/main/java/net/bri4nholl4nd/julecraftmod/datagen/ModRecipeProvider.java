package net.bri4nholl4nd.julecraftmod.datagen;

import net.bri4nholl4nd.julecraftmod.JuleCraftMod;
import net.bri4nholl4nd.julecraftmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        //<editor-fold desc="Compressed Limestone">
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_1.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_2.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_1.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_3.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_2.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_4.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_3.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_5.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_4.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_6.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_5.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_7.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_6.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_8.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_7.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_9.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_8.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer);
        //</editor-fold>

        //<editor-fold desc="Uncompressed Limestone">
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE.get(), 9)
                .requires(ModBlocks.LIMESTONE_1.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_1_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_1.get(), 9)
                .requires(ModBlocks.LIMESTONE_2.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_2_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_2.get(), 9)
                .requires(ModBlocks.LIMESTONE_3.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_3_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_3.get(), 9)
                .requires(ModBlocks.LIMESTONE_4.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_4_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_4.get(), 9)
                .requires(ModBlocks.LIMESTONE_5.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_5_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_5.get(), 9)
                .requires(ModBlocks.LIMESTONE_6.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_6_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_6.get(), 9)
                .requires(ModBlocks.LIMESTONE_7.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_7_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_7.get(), 9)
                .requires(ModBlocks.LIMESTONE_8.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_8_uncompressed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_8.get(), 9)
                .requires(ModBlocks.LIMESTONE_9.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(consumer, new ResourceLocation(JuleCraftMod.MOD_ID, "limestone_9_uncompressed"));
        //</editor-fold>
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  JuleCraftMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
