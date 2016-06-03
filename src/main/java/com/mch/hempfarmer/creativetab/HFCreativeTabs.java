package com.mch.hempfarmer.creativetab;

import com.mch.hempfarmer.init.HFItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HFCreativeTabs extends CreativeTabs{

	public HFCreativeTabs(int index, String label){
		super(index, label);
	}

	
    public static final HFCreativeTabs HFCombat = new HFCreativeTabs(CreativeTabs.getNextID(), "combat"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.resin_sword;
        }
    };
    public static final HFCreativeTabs HFCrops = new HFCreativeTabs(CreativeTabs.getNextID(), "crops"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.leaf;
        }
    };
    
    public static final HFCreativeTabs HFMaterials = new HFCreativeTabs(CreativeTabs.getNextID(), "materials"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.burlap;
        }
    };
	
	
	@Override
	public Item getTabIconItem(){
		return null;
	}
	

}
