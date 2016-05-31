package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class HFArmor extends ItemArmor{
	
	

    public HFArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(location.toString());
		this.setCreativeTab(HFCreativeTabs.HFTab);
    }
    
}

