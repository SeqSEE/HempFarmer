package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class IndicaJoint extends Joint{

	
	public IndicaJoint(String name) {
		super(name);
	}

	@Override
	@Nullable
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		--stack.stackSize;
		Random random = new Random();
        int x = random.nextInt(1500) + 50;
        int y = random.nextInt(2) + 1;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(2), x, 1, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(17), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(24), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(8), x, y, true, false));
        x = random.nextInt(100) + 1;
        if (x > 90){
        	x = random.nextInt(210) + 50;
            entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(9), x, 1, true, false));	
            x = random.nextInt(105) + 50;
            entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(25), x, 1, true, false));
        }
        return stack;
	}   
}
