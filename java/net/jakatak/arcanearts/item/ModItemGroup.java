package net.jakatak.arcanearts.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.jakatak.arcanearts.ArcaneArts;
import net.jakatak.arcanearts.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ARCANE_ARTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArcaneArts.MOD_ID, "arcane_arts_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.arcane_arts_group"))
                    .icon(() -> new ItemStack(ModItems.EITR_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EITR_DUST);
                        entries.add(ModBlocks.EITR_DUST_BLOCK);
                        entries.add(ModBlocks.EITR_ORE);
                        entries.add(ModBlocks.DEEPSLATE_EITR_ORE);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);

                    }).build());

    public static void registerItemGroups() {

    }
}