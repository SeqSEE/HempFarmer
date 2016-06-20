package com.mch.hempfarmer.block.burlap;

import com.mch.hempfarmer.block.material.HFMaterial;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBurlap extends Block{

    protected static final AxisAlignedBB BURLAP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

	public BlockBurlap(String name) {
        super(HFMaterial.BURLAP);
        this.setTickRandomly(true);
        this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFMaterials);
		this.lightOpacity = 0;
		addToBlocks(this);
	}

	private void addToBlocks(BlockBurlap block) {
		HFBlocks.blocks.add(block);
	}
  
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BURLAP_AABB;
    }

	public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
	
	public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        return super.canPlaceBlockAt(world, pos) && this.canBlockStay(world, pos);
    }
    
    private boolean canBlockStay(World world, BlockPos pos) {
        return !world.isAirBlock(pos.down());
    }
    
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        if (entityIn.isSneaking())
        {
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        }
        else
        {
            entityIn.fall(fallDistance, 0.0F);
        }
    }
    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return true;
    }

}
