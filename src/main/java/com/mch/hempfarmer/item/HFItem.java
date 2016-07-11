package com.mch.hempfarmer.item;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HFItem extends Item {
	
	public HFItem(String name, int maxStack) {
		this.setMaxStackSize(maxStack);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFMaterials);
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}
	
	
}