package com.mch.hempfarmer.item;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.item.Item;

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
