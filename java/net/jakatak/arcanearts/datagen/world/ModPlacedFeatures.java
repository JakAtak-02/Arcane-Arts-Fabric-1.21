package net.jakatak.arcanearts.datagen.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

import static net.jakatak.arcanearts.ArcaneArts.identifier;


public class ModPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> ORE_EITR_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, identifier("ore_eitr_placed"));
    public static final RegistryKey<PlacedFeature> ORE_SILVER_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, identifier("ore_silver_placed"));
    public ModPlacedFeatures()
    {
        throw new AssertionError();
    }

    public static void bootstrap(Registerable<PlacedFeature> context)
    {

        var lookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //region OVERWORLD
        register(context, ORE_EITR_PLACED_KEY, lookup.getOrThrow(ModConfiguredFeatures.ORE_EITR_KEY),
                ModOrePlacement.modifiersWithRarity(10, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(55))));

        register(context, ORE_SILVER_PLACED_KEY, lookup.getOrThrow(ModConfiguredFeatures.ORE_SILVER_KEY),
                ModOrePlacement.modifiersWithRarity(10, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));

    }

    public static RegistryKey<PlacedFeature> getRegisterKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, identifier(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}