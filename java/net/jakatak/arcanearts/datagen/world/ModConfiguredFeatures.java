package net.jakatak.arcanearts.datagen.world;


import net.jakatak.arcanearts.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

import static net.jakatak.arcanearts.ArcaneArts.identifier;


public class ModConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_EITR_KEY = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, identifier("ore_eitr"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_SILVER_KEY = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, identifier("ore_silver"));

    public ModConfiguredFeatures()
    {
        throw new AssertionError();
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overworldEitrOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.EITR_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepReplaceables, ModBlocks.DEEPSLATE_EITR_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));


        // 3 --> Vein Size Per Vein
        register(context, ORE_EITR_KEY, Feature.ORE, new OreFeatureConfig(overworldEitrOres, 8));
        register(context, ORE_SILVER_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 12));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}