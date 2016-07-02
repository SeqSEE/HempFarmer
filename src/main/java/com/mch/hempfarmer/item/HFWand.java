package com.mch.hempfarmer.item;

import java.util.Set;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HFWand extends HFItem{
	
	private int uses;

	public HFWand(String name) {
		super(name, 1);
		if (this.getRegistryName().toString().substring(11).startsWith("superior")){
			this.setMaxDamage(300);
		}
		else {
			this.setMaxDamage(75);
		}
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		IBlockState state = world.getBlockState(pos);
		IBlockState newState = null;
		boolean changable = false;
        if (state.getBlock().equals(Blocks.COBBLESTONE)){
        	changable = true;
        	newState = Blocks.GRAVEL.getDefaultState();
        }
        else if (state.getBlock().equals(Blocks.GRAVEL)){
        	changable = true;
       		newState = Blocks.SAND.getDefaultState();
        }
        else if (state.getBlock().equals(Blocks.SAND)){
        	changable = true;
        	newState = Blocks.CLAY.getDefaultState();
        }
        if (changable && player.canPlayerEdit(pos, facing, stack)){
        	world.setBlockState(pos, newState);
        	stack.damageItem(1, player);
        	return EnumActionResult.SUCCESS;
        }
        else {
        	return EnumActionResult.FAIL;
        }
    }
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		entity.setVelocity(0.0, 1.5, 0);
		return true;
    }

}
