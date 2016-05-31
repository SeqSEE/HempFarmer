package com.mch.hempfarmer;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class HFIcon extends Item{
	
	public HFIcon(String name){
	ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
	this.setRegistryName(location);
	this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
