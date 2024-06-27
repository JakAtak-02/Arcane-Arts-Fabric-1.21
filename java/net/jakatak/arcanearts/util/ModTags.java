package net.jakatak.arcanearts.util;

import net.jakatak.arcanearts.ArcaneArts;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import javax.swing.text.html.parser.Entity;

public class ModTags {

    public static class Entities {
        public static final TagKey<EntityType<?>> VULNERABLE_TO_SILVER =
                createCommonEntityTag("vulnerable_to_silver");

        private static TagKey<EntityType<?>> createEntityTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(ArcaneArts.MOD_ID, name));
        }

        private static TagKey<EntityType<?>> createCommonEntityTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of("c", name));
        }
    }


}