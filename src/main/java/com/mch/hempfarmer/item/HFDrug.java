package com.mch.hempfarmer.item;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.creativetab.DrugsTab;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.item.Item;

public class HFDrug extends Item {

	public HFDrug(String name, int maxStack) {
		this.setMaxStackSize(maxStack);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		if (HempFarmer.drugs == true){
			this.setCreativeTab(DrugsTab.HFDrugs);
			addToItems(this);
		}
	}
	
	private void addToItems(Item item) {
		HFItems.items.add(item);
	}
}
