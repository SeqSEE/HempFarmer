package com.mch.hempfarmer.item.joint;

import java.util.Random;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.item.HFItem;


public class Joint extends HFItem{

	public Joint(String name, int maxStack) {
		super(name, maxStack);
		this.setCreativeTab(HFCreativeTabs.HFDrugs);
	}
	
}
