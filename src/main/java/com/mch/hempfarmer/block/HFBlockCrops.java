package com.mch.hempfarmer.block;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.BlockCrops;

public class HFBlockCrops extends BlockCrops {
	
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
