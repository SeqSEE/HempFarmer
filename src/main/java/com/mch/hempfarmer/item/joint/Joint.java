package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.creativetab.DrugsTab;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.item.HFDrug;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Joint extends HFDrug{
	
	public int itemUseDuration;
    
	public Joint(String name, int maxStack) {
		super(name, maxStack);
		this.itemUseDuration = 16;
	}
	
	public void addToItems(Item item) {
		HFItems.items.add(item);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand){  
		playerIn.setActiveHand(hand);
        return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
    }
	@Override
    @Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity) {
        --stack.stackSize;
		Random random = new Random();
        int a = random.nextInt(500) + 100;
        int b = random.nextInt(2) + 1;
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(2), a, 1, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(17), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(24), a, b, true, false));
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(8), a, b, true, false));
        a = random.nextInt(20) + 10;
        entity.addPotionEffect(new PotionEffect(Potion.getPotionById(9), a, 1, true, false));
        smoke(entity, world);
        return stack;
    }
	@Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 16;
    }
	 public EnumAction getItemUseAction(ItemStack stack){
	        return EnumAction.BOW;
	    }
	 

	 public void smoke(EntityLivingBase entity, World world){
		 double x = entity.lastTickPosX;
		 double y = entity.lastTickPosY + 1.5;
		 double z = entity.lastTickPosZ;
		 world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x - 0.2, y, z - 0.2, -0.05, 0.05, 0.05);
		 world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x, y, z, 0.05, -0.05, 0.05);
		 world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x + 0.2, y, z + 0.2, 0.05, 0.05, -0.05);
		 world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x - 0.2, y, z - 0.2, 0.05, -0.05, -0.05);
		 world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, -0.05, -0.05, 0.05);
		 world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + 0.2, y, z + 0.2, -0.05, -0.05, -0.05);
	 }
	 
}
