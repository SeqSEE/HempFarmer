package com.mch.hempfarmer.block.burlap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BurlappedBlock extends Block{

	private IBlockState originalBlockState;
	
	public BurlappedBlock(Material materialIn) {
		super(materialIn);
		this.setBlockUnbreakable();
	}
	
	public IBlockState bulappedBlock(IBlockState state){
		originalBlockState = state;
		IBlockState newBlockState = this.getDefaultState();
		return newBlockState;
	}
	
	

}
