package com.mch.hempfarmer.init;

import java.util.ArrayList;
import java.util.List;

import com.mch.hempfarmer.HFIcon;
import com.mch.hempfarmer.item.HFArmor;
import com.mch.hempfarmer.item.HFItem;
import com.mch.hempfarmer.item.HFSeeds;
import com.mch.hempfarmer.item.HFSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class HFItems extends Items{
	
	//HempFarmer Icon
	public static Item leaf = new HFIcon("leaf");
	
	//Regular Items
	public static Item raw_hemp = new HFItem("raw_hemp");
	public static Item dry_hemp = new HFItem("dry_hemp");
	public static Item burlap = new HFItem("burlap");
	public static Item oily_burlap = new HFItem("oily_burlap");
	public static Item resin_burlap = new HFItem("resin_burlap");
	public static Item hemp_oil = new HFItem("hemp_oil");
	public static Item resin = new HFItem("resin");
	
	//Seeds
	public static Item seeds_hemp = new HFSeeds("seeds_hemp", HFBlocks.hemp_crop, 4);
	public static Item seeds_indica = new HFSeeds("seeds_indica", HFBlocks.indica_crop, 1);
	public static Item seeds_sativa = new HFSeeds("seeds_sativa", HFBlocks.sativa_crop, 1);
		
	//Armors
	public static Item burlap_boots = new HFArmor("burlap_boots", HFArmor.BURLAP, 1, EntityEquipmentSlot.FEET);
	public static Item burlap_leggings = new HFArmor("burlap_leggings", HFArmor.BURLAP, 1, EntityEquipmentSlot.LEGS);
	public static Item burlap_chestplate = new HFArmor("burlap_chestplate", HFArmor.BURLAP, 1, EntityEquipmentSlot.CHEST);
	public static Item burlap_helmet = new HFArmor("burlap_helmet", HFArmor.BURLAP, 1, EntityEquipmentSlot.HEAD);
	public static Item resin_burlap_boots = new HFArmor("resin_burlap_boots", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.FEET);
	public static Item resin_burlap_leggings = new HFArmor("resin_burlap_leggings", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.LEGS);
	public static Item resin_burlap_chestplate = new HFArmor("resin_burlap_chestplate", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.CHEST);
	public static Item resin_burlap_helmet = new HFArmor("resin_burlap_helmet", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.HEAD);
	
	//Weapons
	public static Item resin_sword = new HFSword("resin_sword", HFSword.RESIN);
	
	public static List<Item> itemList(){
		List<Item> items = new ArrayList();
		items.add(leaf);
		items.add(raw_hemp);
		items.add(dry_hemp);
		items.add(burlap);
		items.add(oily_burlap);
		items.add(resin_burlap);
		items.add(hemp_oil);
		items.add(resin);
		items.add(seeds_hemp);
		items.add(seeds_indica);
		items.add(seeds_sativa);
		items.add(burlap_boots);
		items.add(burlap_leggings);
		items.add(burlap_chestplate);
		items.add(burlap_helmet);
		items.add(resin_burlap_boots);
		items.add(resin_burlap_leggings);
		items.add(resin_burlap_chestplate);
		items.add(resin_burlap_helmet);
		items.add(resin_sword);
		return items;
	}

	public static void register() {
		for (Item item : itemList()){
			GameRegistry.register(item);
		}		
	}
	
	public static void registerRender(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : itemList()){
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}
	

	
	
}
