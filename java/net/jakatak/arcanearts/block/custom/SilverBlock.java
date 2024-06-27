package net.jakatak.arcanearts.block.custom;


import net.jakatak.arcanearts.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.TagEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;

import java.time.ZoneOffset;

public class SilverBlock extends Block {
    public SilverBlock(Settings settings) {
        super(settings);
    }
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if (entity.getType().isIn(ModTags.Entities.VULNERABLE_TO_SILVER)) {
            entity.damage(world.getDamageSources().magic(), 1.0F);
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}