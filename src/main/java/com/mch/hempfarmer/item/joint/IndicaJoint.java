package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class IndicaJoint extends Joint{

	
	public IndicaJoint(String name) {
		super(name);
	}

	@Override
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entity) {
		--stack.stackSize;
		double x = entity.lastTickPosX;
		double y = entity.lastTickPosY + 1.5;
		double z = entity.lastTickPosZ;
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x - 0.1, y, z - 0.1, 0.1, 0.1, 0.1);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, 0.1, 0.1, 0.1);
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x + 0.1, y, z + 0.1, 0.1, 0.1, 0.1);
		Random random = new Random();
        int a = random.nextInt(1500) + 50;
        int b = random.nextInt(2) + 1;
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(2), a, 1, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(17), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(24), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(8), a, b, true, false));
        a = random.nextInt(100) + 1;
        if (a > 90){
        	a = random.nextInt(210) + 50;
            entity.addPotionEffect(new PotionEffect(Potion.getPotionById(9), a, 1, true, false));	
            a = random.nextInt(95) + 50;
            entity.addPotionEffect(new PotionEffect(Potion.getPotionById(25), a, 1, true, false));
        }
        return stack;
	}   
}
