package com.mch.hempfarmer.block.burlap;

import java.util.Random;

import com.mch.hempfarmer.block.HFBlockBurlap;
import com.mch.hempfarmer.block.HFBlockDirt;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ResinBurlap extends HFBlockBurlap{

	public ResinBurlap(Material material, String name) {
		super(material, name);
		this.blockResistance = 100.0F;
	}
	
    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
    	Block block = world.getBlockState(pos.down()).getBlock();
    	if (block.equals(Blocks.DIRT) || block.equals(Blocks.GRASS)){
    		if (!this.getRegistryName().toString().endsWith("_block")) {
    			HFBlockDirt blockOut = (HFBlockDirt)HFBlocks.resin_dirt;
    			blockOut.fromOil = false;
    			if (!world.isRemote) {
    			world.setBlockState(pos.down(), blockOut.getDefaultState());
    			}
    		}
    	}
    	return this.getDefaultState();
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
    	Block block = world.getBlockState(pos.down()).getBlock();
    	if (block.equals(HFBlocks.resin_dirt)){
    		if (!world.isRemote) {
    		world.setBlockState(pos.down(), Blocks.DIRT.getDefaultState());
    		}
    	}
    }
    


}
