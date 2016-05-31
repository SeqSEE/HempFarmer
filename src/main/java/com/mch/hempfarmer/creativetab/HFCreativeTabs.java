package com.mch.hempfarmer.creativetab;

import com.mch.hempfarmer.init.HFItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HFCreativeTabs extends CreativeTabs{

	public HFCreativeTabs(int index, String label){
		super(index, label);
	}

    public static final HFCreativeTabs HFTab = new HFCreativeTabs(CreativeTabs.getNextID(), "hempfarmer"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
            return HFItems.icon;
        }
    };
	
	
	@Override
	public Item getTabIconItem(){
		return null;
	}
	

}
