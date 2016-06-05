package com.mch.hempfarmer.item;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class HFSword extends ItemSword{
	
	public static ToolMaterial RESIN = EnumHelper.addToolMaterial("RESIN", 3, 30, 6.0F, 3.0F, 30);
	
	private final float attackDamage;
	private final ToolMaterial material;
	
	public HFSword(String name, ToolMaterial material) {
		super(material);
		this.material = material;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFCombat);
		this.setMaxDamage(material.getMaxUses());
		this.attackDamage = 3.0F + this.material.getDamageVsEntity();
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}



}
