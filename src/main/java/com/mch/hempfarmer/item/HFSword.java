package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class HFSword extends ItemSword{
	
	public static ToolMaterial RESIN = EnumHelper.addToolMaterial("RESIN", 3, 30, 6.0F, 3.0F, 30);
	
	private final float attackDamage;
	private final ToolMaterial material;
	

	public HFSword(String name, ToolMaterial material) {
		super(material);
		this.material = material;
		ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFTab);
		this.setMaxDamage(material.getMaxUses());
		this.attackDamage = 3.0F + this.material.getDamageVsEntity();
	}



}
