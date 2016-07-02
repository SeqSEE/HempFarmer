package com.mch.hempfarmer.block;

import com.mch.hempfarmer.block.material.HFMaterial;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HFBlockBurlap extends BlockBreakable {
	
	protected static AxisAlignedBB AABB;
	
	public HFBlockBurlap(Material material, String name) {
		super(material , false);
        this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.blockSoundType = Blocks.HAY_BLOCK.getSoundType();
		this.setCreativeTab(HFCreativeTabs.HFMaterials);
		addToBlocks(this);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		AxisAlignedBB aabb;
		if (state.getBlock().getRegistryName().toString().endsWith("_block")) {
			AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		}
		else {
			AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);
		}
		return AABB;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
    }
	
	@Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        return super.canPlaceBlockAt(world, pos) && this.canBlockStay(world, pos);
    }
	
    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
        this.checkForDrop(worldIn, pos, state);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)    {
    	boolean fullCube = state.getBlock().getRegistryName().toString().endsWith("_block");
		return fullCube;
    }
    
	private void addToBlocks(HFBlockBurlap block) {
		HFBlocks.blocks.add(block);
	}
	
	private boolean canBlockStay(World world, BlockPos pos) {
		return (world.getBlockState(pos.down()).isNormalCube());
    }
	

    private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.canBlockStay(worldIn, pos)) {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockToAir(pos);
            return false;
        }
        else {
            return true;
        }
    }
	


}
