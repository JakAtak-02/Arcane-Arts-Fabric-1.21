package net.jakatak.arcanearts;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.jakatak.arcanearts.datagen.*;


import net.jakatak.arcanearts.datagen.world.ModConfiguredFeatures;
import net.jakatak.arcanearts.datagen.world.ModPlacedFeatures;
import net.jakatak.arcanearts.datagen.world.ModWorldGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;


public class ArcaneArtsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockLootTableGenerator::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModEntityTagProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}


	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}

}
