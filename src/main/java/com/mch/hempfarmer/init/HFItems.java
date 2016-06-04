package com.mch.hempfarmer.init;

import java.util.ArrayList;
import java.util.List;

import com.mch.hempfarmer.item.HFArmor;
import com.mch.hempfarmer.item.HFIcon;
import com.mch.hempfarmer.item.HFItem;
import com.mch.hempfarmer.item.HFResinShield;
import com.mch.hempfarmer.item.HFSeeds;
import com.mch.hempfarmer.item.HFSword;
import com.mch.hempfarmer.item.Joint;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class HFItems extends Items{
	
	public static List<Item> items = new ArrayList();
	/*Joints
	public static Item sativa_joint = new Joint("sativa_joint");
	*/
	//HempFarmer Icon
	public static Item leaf = new HFIcon("leaf");
	
	//Regular Items
	public static Item raw_hemp = new HFItem("raw_hemp", 64);
	public static Item dry_hemp = new HFItem("dry_hemp", 64);
	public static Item burlap = new HFItem("burlap", 64);
	public static Item oily_burlap = new HFItem("oily_burlap", 64);
	public static Item resin_burlap = new HFItem("resin_burlap", 64);
	public static Item hemp_oil = new HFItem("hemp_oil", 1);
	public static Item resin = new HFItem("resin", 64);
	
	//Seeds
	public static Item seeds_hemp = new HFSeeds("seeds_hemp", HFBlocks.hemp_crop, 4);
	public static Item seeds_indica = new HFSeeds("seeds_indica", HFBlocks.indica_crop, 1);
	public static Item seeds_sativa = new HFSeeds("seeds_sativa", HFBlocks.sativa_crop, 1);
		
	//Armors
	public static Item burlap_boots = new HFArmor("burlap_boots", HFArmor.BURLAP, 1, EntityEquipmentSlot.FEET);
	public static Item burlap_leggings = new HFArmor("burlap_leggings", HFArmor.BURLAP, 1, EntityEquipmentSlot.LEGS);
	public static Item burlap_chestplate = new HFArmor("burlap_chestplate", HFArmor.BURLAP, 1, EntityEquipmentSlot.CHEST);
	public static Item burlap_helmet = new HFArmor("burlap_helmet", HFArmor.BURLAP, 1, EntityEquipmentSlot.HEAD);
	public static Item resin_boots = new HFArmor("resin_boots", HFArmor.RESIN, 1, EntityEquipmentSlot.FEET);
	public static Item resin_leggings = new HFArmor("resin_leggings", HFArmor.RESIN, 1, EntityEquipmentSlot.LEGS);
	public static Item resin_chestplate = new HFArmor("resin_chestplate", HFArmor.RESIN, 1, EntityEquipmentSlot.CHEST);
	public static Item resin_helmet = new HFArmor("resin_helmet", HFArmor.RESIN, 1, EntityEquipmentSlot.HEAD);
	public static Item resin_burlap_boots = new HFArmor("resin_burlap_boots", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.FEET);
	public static Item resin_burlap_leggings = new HFArmor("resin_burlap_leggings", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.LEGS);
	public static Item resin_burlap_chestplate = new HFArmor("resin_burlap_chestplate", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.CHEST);
	public static Item resin_burlap_helmet = new HFArmor("resin_burlap_helmet", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.HEAD);

	public static Item resin_shield = new HFResinShield("resin_shield");
	//Weapons
	public static Item resin_sword = new HFSword("resin_sword", HFSword.RESIN);
	
	public static List<Item> itemList(){
		return items;
	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : itemList()){
			GameRegistry.register(item);
		}		
	}
	
	public static void registerRender(FMLInitializationEvent event){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : itemList()){
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}
	

	
	
}
