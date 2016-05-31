package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class HFSeedsHemp extends ItemSeeds implements net.minecraftforge.common.IPlantable{


	public HFSeedsHemp(String name, Block crop, Block soil, int weight) {
		super(crop, soil);
		ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(location.toString());
		this.setCreativeTab(HFCreativeTabs.HFTab);
		register(this, weight);
	 }
			 

 	private void register(HFSeedsHemp seeds, int weight) {
 		MinecraftForge.addGrassSeed(new ItemStack(seeds), weight);
	}

	@Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
        if (facing == EnumFacing.UP && playerIn.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        {
            worldIn.setBlockState(pos.up(), HFBlocks.hemp_crop.getDefaultState());
            --stack.stackSize;
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }
 	
    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Crop;
    }
 	
    @Override
    public net.minecraft.block.state.IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return HFBlocks.hemp_crop.getDefaultState();
    }
	
}
	

