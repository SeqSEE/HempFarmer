package com.mch.hempfarmer.item;

import javax.annotation.Nullable;

import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HFOil extends HFItem{

	public HFOil(String name) {
		super(name, 1);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		Block block = world.getBlockState(pos).getBlock();
		if (block == Blocks.DIRT || block == Blocks.GRASS){
			--stack.stackSize;
			String oil = stack.getItem().getRegistryName().toString();
			oil = oil.substring(11, oil.length() - 4);
			int oilType = oil.equals("hemp") ? 0 : 1;
			if (oil.equals("violet")){
				oilType++;
			}
			IBlockState state;
			switch (oilType){
			case 1: state = HFBlocks.lime_dirt.getDefaultState();
					break;
			case 2: state = HFBlocks.violet_dirt.getDefaultState();
					break;
			default: state = HFBlocks.oily_dirt.getDefaultState();
					break;
			}
			world.setBlockState(pos, state);
			return EnumActionResult.PASS;
		}
		return EnumActionResult.FAIL;
	}
}
