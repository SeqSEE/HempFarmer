package com.mch.hempfarmer.block.dirt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.mch.hempfarmer.block.HFBlockDirt;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CoveredDirt extends HFBlockDirt{

	public CoveredDirt(String name) {
		super(name);
	}

	@Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
            entityIn.fall(fallDistance = 0, 0.0F);
    }
	
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = new ArrayList<ItemStack>();
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;
		Item item = Blocks.DIRT.getItemDropped(state, rand, fortune);
		ret.add(new ItemStack(item, 1));
		return ret;
	}

	
}
