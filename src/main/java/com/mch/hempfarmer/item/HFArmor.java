package com.mch.hempfarmer.item;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class HFArmor extends ItemArmor{	
	
	public static ArmorMaterial BURLAP = addArmorMaterial("BURLAP", "hempfarmer:burlap", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static ArmorMaterial RESIN = addArmorMaterial("RESIN", "hempfarmer:resin", 7, new int[]{2, 3, 4, 2}, 20, SoundEvents.BLOCK_GLASS_STEP, 0.0F);
	public static ArmorMaterial RESIN_BURLAP = addArmorMaterial("RESIN_BURLAP", "hempfarmer:resin_burlap", 7, new int[]{3, 4, 5, 3}, 15, SoundEvents.BLOCK_FENCE_GATE_CLOSE, 0.0F);
	
	//Workaround for broken EnumHelper.addArmorMaterial
	private static ItemArmor.ArmorMaterial addArmorMaterial(String enumName, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness) {
		return EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, enumName, new Class<?>[]{String.class, int.class, int[].class, int.class, SoundEvent.class, float.class}, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness);
	}
	
	public HFArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        ResourceLocation location = new ResourceLocation(Reference.ID + ":" + name);
		this.setRegistryName(location);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFCombat);
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}

	
}

