package com.mch.hempfarmer.item;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;

public class HFDrug extends HFItem {

	public HFDrug(String name, int maxStack) {
		super(name, maxStack);
		this.setCreativeTab(HFCreativeTabs.HFDrugs);
	}
}
