package com.mch.hempfarmer.block.burlap;

import com.mch.hempfarmer.block.material.HFMaterial;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.MapColor;
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

public class BlockBurlap extends BlockBreakable{
	
	protected static final AxisAlignedBB BURLAP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

	public BlockBurlap(String name) {
		super(HFMaterial.BURLAP, false);
        this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFMaterials);
		addToBlocks(this);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BURLAP_AABB;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
    }

	@Override
	public boolean isFullCube(IBlockState state) {
        return false;
    }
	
	@Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        return super.canPlaceBlockAt(world, pos) && this.canBlockStay(world, pos);
    }

    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
            entityIn.fall(fallDistance = 0, 0.0F);
    }
    
    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
    	IBlockState state = world.getBlockState(pos.down());
    	BurlappedBlock block = new BurlappedBlock(HFMaterial.BURLAP);
    	world.setBlockState(pos, block.bulappedBlock(state));
    	return this.getDefaultState();
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
    	
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
    
	private void addToBlocks(BlockBurlap block) {
		HFBlocks.blocks.add(block);
	}
	
	private boolean canBlockStay(World world, BlockPos pos) {
		boolean isAirBlock = world.isAirBlock(pos.down());
		boolean isLiquidBlock = world.getBlockState(pos.down()).getMaterial().isLiquid();
        return (!isAirBlock && !isLiquidBlock);
    }

}
