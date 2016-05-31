package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class HFSword extends ItemSword{
	
	private final float attackDamage;
	private final ToolMaterial material;
	

	public HFSword(String name, ToolMaterial material) {
		super(material);
		this.material = material;
		ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(location.toString());
		this.setCreativeTab(HFCreativeTabs.HFTab);
		this.setMaxDamage(material.getMaxUses());
		this.attackDamage = 3.0F + HFItems.RESIN.getDamageVsEntity();
	}
	


}
