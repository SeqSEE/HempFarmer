package com.mch.hempfarmer.item;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class HFArmor extends ItemArmor {	
	
	public static ArmorMaterial BURLAP = EnumHelper.addArmorMaterial("BURLAP", "hempfarmer:burlap", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ArmorMaterial LIME_BURLAP = EnumHelper.addArmorMaterial("LIME_BURLAP", "hempfarmer:lime_burlap", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ArmorMaterial VIOLET_BURLAP = EnumHelper.addArmorMaterial("VIOLET_BURLAP", "hempfarmer:violet_burlap", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ArmorMaterial RESIN_BURLAP = EnumHelper.addArmorMaterial("RESIN_BURLAP", "hempfarmer:resin_burlap", 7, new int[]{3, 4, 5, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ArmorMaterial RESIN = EnumHelper.addArmorMaterial("RESIN", "hempfarmer:resin", 7, new int[]{2, 3, 4, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public HFArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFCombat);
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}
}

