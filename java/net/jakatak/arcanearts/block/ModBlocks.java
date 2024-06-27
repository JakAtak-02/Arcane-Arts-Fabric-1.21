package net.jakatak.arcanearts.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;


import net.jakatak.arcanearts.ArcaneArts;
import net.jakatak.arcanearts.block.custom.SilverBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.IntProviderType;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;

public class ModBlocks {
    public static final Block EITR_DUST_BLOCK = registerBlock("eitr_dust_block",
            new ColoredFallingBlock(new ColorCode(-8356741),Block.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER)) {
            });
    public static final Block DEEPSLATE_EITR_ORE = registerBlock("deepslate_eitr_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),Block.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block EITR_ORE = registerBlock("eitr_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),Block.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),Block.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),Block.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
          new Block(Block.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new SilverBlock(Block.Settings.copy(Blocks.GOLD_BLOCK).sounds(BlockSoundGroup.METAL)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ArcaneArts.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        return Registry.register(Registries.BLOCK, Identifier.of(ArcaneArts.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneArts.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        ArcaneArts.LOGGER.info("Registering ModBlocks for " + ArcaneArts.MOD_ID);
    }
}