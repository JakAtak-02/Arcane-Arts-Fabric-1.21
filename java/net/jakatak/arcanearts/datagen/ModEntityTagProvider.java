package net.jakatak.arcanearts.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jakatak.arcanearts.util.ModTags;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryWrapper;


import java.util.concurrent.CompletableFuture;

public class ModEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(ModTags.Entities.VULNERABLE_TO_SILVER)
                .add(EntityType.ZOMBIE)
                .add(EntityType.SKELETON)
                .add(EntityType.ZOMBIE_VILLAGER)
                .add(EntityType.WITHER)
                .add(EntityType.WITHER_SKELETON)
                .add(EntityType.ZOMBIFIED_PIGLIN)
                .add(EntityType.SKELETON_HORSE)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.STRAY)
                .add(EntityType.HUSK)
                .add(EntityType.PHANTOM)
                .add(EntityType.DROWNED)
                .add(EntityType.ZOGLIN);

    }
}