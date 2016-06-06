package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SativaJoint extends Joint{

	public SativaJoint(String name) {
		super(name);
	}
	@Override
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		--stack.stackSize;
		Random random = new Random();
        int x = random.nextInt(1500) + 50;
        int y = random.nextInt(2) + 1;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(17), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(24), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(10), x, y, true, false));
        x = random.nextInt(210) + 50;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(16), x, 1, true, false));
        return stack;
	}

}
