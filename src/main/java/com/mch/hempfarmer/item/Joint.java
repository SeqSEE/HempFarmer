package com.mch.hempfarmer.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Joint extends HFItem{

	public Joint(String name) {
		super(name);
	}
	
	 
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand){
		double d0 = (double)playerIn.prevPosX + 0.5D;
        double d1 = (double)playerIn.prevPosY + 0.7D;
        double d2 = (double)playerIn.getEyeHeight() + 0.5D;
        double d3 = 0.22D;
        double d4 = 0.27D;
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 , d1, d2 , 0.0D, 0.0D, 0.0D, new int[0]);
        return new ActionResult (EnumActionResult.SUCCESS, itemStackIn);
        
       
    }

}
