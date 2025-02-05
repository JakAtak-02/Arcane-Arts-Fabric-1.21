package net.jakatak.arcanearts.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jakatak.arcanearts.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.EITR_ORE,
                        ModBlocks.DEEPSLATE_EITR_ORE,
                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.RAW_SILVER_BLOCK,
                        ModBlocks.SILVER_ORE,
                        ModBlocks.DEEPSLATE_SILVER_ORE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.EITR_DUST_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                 .add(ModBlocks.EITR_ORE,
                        ModBlocks.DEEPSLATE_EITR_ORE,
                         ModBlocks.SILVER_BLOCK,
                         ModBlocks.RAW_SILVER_BLOCK,
                         ModBlocks.SILVER_ORE,
                         ModBlocks.DEEPSLATE_SILVER_ORE);
    }
}
