package net.jakatak.arcanearts;

import net.fabricmc.api.ModInitializer;

import net.jakatak.arcanearts.block.ModBlocks;
import net.jakatak.arcanearts.item.ModItemGroup;
import net.jakatak.arcanearts.item.ModItems;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.IdentityHashMap;

public class ArcaneArts implements ModInitializer {
	public static final String MOD_ID = "arcaneartsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
	@NotNull
	public static Identifier identifier(@NotNull String path) { return Identifier.of(MOD_ID,path);}
	@NotNull
	public static Identifier vanillaID(@NotNull String path) { return Identifier.ofVanilla(path);}
}
