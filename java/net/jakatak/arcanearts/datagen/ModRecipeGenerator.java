package net.jakatak.arcanearts.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jakatak.arcanearts.block.ModBlocks;
import net.jakatak.arcanearts.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeGenerator extends FabricRecipeProvider
{
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter)
    {


        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.BUILDING_BLOCKS, ModItems.EITR_DUST,
                RecipeCategory.DECORATIONS, ModBlocks.EITR_DUST_BLOCK);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT,
                RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);

        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SILVER,
                RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);




        offerBlasting(exporter, List.of(ModBlocks.EITR_ORE), RecipeCategory.MISC, ModItems.EITR_DUST, 5.0f, 100, "eitr_ore");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_EITR_ORE), RecipeCategory.MISC, ModItems.EITR_DUST, 5.0f, 100, "eitr_ore");
        offerSmelting(exporter, List.of(ModBlocks.EITR_ORE), RecipeCategory.MISC, ModItems.EITR_DUST, 5.0f, 200, "eitr_ore");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_EITR_ORE), RecipeCategory.MISC, ModItems.EITR_DUST, 5.0f, 200, "eitr_ore");

       offerBlasting(exporter, List.of(ModBlocks.SILVER_ORE), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 100, "silver_ore");
       offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_SILVER_ORE), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 100, "silver_ore");
       offerSmelting(exporter, List.of(ModBlocks.SILVER_ORE), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 200, "silver_ore");
       offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_SILVER_ORE), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 200, "silver_ore");
       offerBlasting(exporter, List.of(ModItems.RAW_SILVER), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 100, "silver_ore");
       offerSmelting(exporter, List.of(ModItems.RAW_SILVER), RecipeCategory.MISC, ModItems.SILVER_INGOT, 5.0f, 200, "silver_ore");

    }
}
