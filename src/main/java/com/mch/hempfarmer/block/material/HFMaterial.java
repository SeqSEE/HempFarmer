package com.mch.hempfarmer.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class HFMaterial extends Material{
	
	public static final HFMaterial BURLAP = (new HFMaterial(MapColor.DIRT));
	public static final HFMaterial VIOLET_BURLAP = (new HFMaterial(MapColor.PURPLE));
	public static final HFMaterial LIME_BURLAP = (new HFMaterial(MapColor.LIME));
	 
	 
	public HFMaterial(MapColor color) {
		super(color);
	}

}
