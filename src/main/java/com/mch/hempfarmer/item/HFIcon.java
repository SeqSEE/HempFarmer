package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class HFIcon extends Item{
	
	public HFIcon(String name){
		this.setRegistryName(name);
		addToItems(this);
	}
	
	private void addToItems(Item item) {
		HFItems.items.add(item);
	}
}
