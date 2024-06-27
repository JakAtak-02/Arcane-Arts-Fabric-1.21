package net.jakatak.arcanearts.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.jakatak.arcanearts.block.ModBlocks;

import net.jakatak.arcanearts.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EITR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EITR_DUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_EITR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.EITR_DUST, Models.GENERATED);
       // itemModelGenerator.register(ModFluids.EITR_BUCKET, Models.GENERATED);
        //itemModelGenerator.register(ModItems.EITR_INFUSED_INGOT,Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET,Models.GENERATED);
        //itemModelGenerator.register(ModItems.MAGICAL_WEAVE,Models.GENERATED);
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGE_ROBES_HELMET));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGE_ROBES_CHESTPLATE));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGE_ROBES_LEGGINGS));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGE_ROBES_BOOTS));

    }
}