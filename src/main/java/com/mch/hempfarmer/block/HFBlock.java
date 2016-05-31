package com.mch.hempfarmer.block;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class HFBlock extends Block{

	public HFBlock(String name, Material materialIn){
		super(materialIn);
		ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(HFCreativeTabs.HFTab);
		
	}

}
