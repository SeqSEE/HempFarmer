package com.mch.hempfarmer.block;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class HFBlockCrops extends BlockCrops {
	public static int seedsGrassRate;
	public static int seedsCropAmount;
	public static int hempAmount;
	public static int budAmount;
	public static Item crop;
	public static String cropName;
	
	public HFBlockCrops(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFCrops);
		addToBlocks(this);
	}

	private void addToBlocks(BlockCrops block) {
		HFBlocks.blocks.add(block);
	}
	
	
}
