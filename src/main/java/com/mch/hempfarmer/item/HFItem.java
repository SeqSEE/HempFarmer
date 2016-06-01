package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class HFItem extends Item{
	
	public HFItem(String name) {
		ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFTab);
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}

}
