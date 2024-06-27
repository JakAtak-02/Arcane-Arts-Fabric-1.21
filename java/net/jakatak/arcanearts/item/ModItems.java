package net.jakatak.arcanearts.item;


import net.jakatak.arcanearts.ArcaneArts;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EITR_DUST = registerItem("eitr_dust",
            new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,  Identifier.of(ArcaneArts.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArcaneArts.LOGGER.info("Registering Mod Items for " + ArcaneArts.MOD_ID);
    }
}