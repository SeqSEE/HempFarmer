package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class SativaJoint extends Joint{

	public SativaJoint(String name, int maxStack) {
		super(name, maxStack);
		this.itemUseDuration = 16;
	}
	@Override
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entity) {
		--stack.stackSize;
		double x = entity.lastTickPosX;
		double y = entity.lastTickPosY + 1.5;
		double z = entity.lastTickPosZ;
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x - 0.2, y, z - 0.2, -0.05, 0.05, 0.05);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x, y, z, 0.05, -0.05, 0.05);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x + 0.2, y, z + 0.2, 0.05, 0.05, -0.05);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x - 0.2, y, z - 0.2, 0.05, -0.05, -0.05);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, -0.05, -0.05, 0.05);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + 0.2, y, z + 0.2, -0.05, -0.05, -0.05);
		Random random = new Random();
        int a = random.nextInt(1500) + 50;
        int b = random.nextInt(2) + 1;
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(17), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(24), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(10), a, b, true, false));
        a = random.nextInt(210) + 50;
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(16), a, b, true, false));
        return stack;
	}

}
