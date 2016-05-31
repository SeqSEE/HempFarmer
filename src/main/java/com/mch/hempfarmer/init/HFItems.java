package com.mch.hempfarmer.init;

import com.mch.hempfarmer.HFIcon;
import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.item.HFArmor;
import com.mch.hempfarmer.item.HFItem;
import com.mch.hempfarmer.item.HFSeedsHemp;
import com.mch.hempfarmer.item.HFSeedsIndica;
import com.mch.hempfarmer.item.HFSeedsSativa;
import com.mch.hempfarmer.item.HFSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFItems extends Items{
	//HempFarmer Icon
	public static Item icon;	
	//Materials
	public static ToolMaterial RESIN = EnumHelper.addToolMaterial("RESIN", 3, 30, 6.0F, 3.0F, 30);
	//Regular Items
	public static Item raw_hemp;
	public static Item dry_hemp;
	public static Item burlap;
	public static Item oily_burlap;
	public static Item resin_burlap;
	public static Item hemp_oil;
	public static Item resin;	
	//Seeds
	public static Item seeds_hemp;
	public static Item seeds_indica;
	public static Item seeds_sativa;
	//Armors
	public static Item burlap_boots;
	public static Item burlap_leggings;
	public static Item burlap_chestplate;
	public static Item burlap_helmet;
	public static Item resin_burlap_boots;
	public static Item resin_burlap_leggings;
	public static Item resin_burlap_chestplate;
	public static Item resin_burlap_helmet;
	//Weapons
	public static Item resin_sword;
	
	
	
	public static void init(){	
		//HempFarmer Icon
		icon = new HFIcon("icon");		
		//Regular Items
		raw_hemp = new HFItem("raw_hemp");
		dry_hemp = new HFItem("dry_hemp");
		burlap = new HFItem("burlap");
		oily_burlap = new HFItem("oily_burlap");
		resin_burlap = new HFItem("resin_burlap");
		hemp_oil = new HFItem("hemp_oil");
		resin = new HFItem("resin");		
		//Seeds
		seeds_hemp = new HFSeedsHemp("seeds_hemp", HFBlocks.hemp_crop, Blocks.FARMLAND, 4);
		seeds_indica = new HFSeedsIndica("seeds_indica", HFBlocks.indica_crop, Blocks.FARMLAND, 1);
		seeds_sativa = new HFSeedsSativa("seeds_sativa", HFBlocks.sativa_crop, Blocks.FARMLAND, 1);
		//Armors
		burlap_boots = new HFArmor("burlap_boots", HFArmor.BURLAP, 1, EntityEquipmentSlot.FEET);
		burlap_leggings = new HFArmor("burlap_leggings", HFArmor.BURLAP, 1, EntityEquipmentSlot.LEGS);
		burlap_chestplate = new HFArmor("burlap_chestplate", HFArmor.BURLAP, 1, EntityEquipmentSlot.CHEST);
		burlap_helmet = new HFArmor("burlap_helmet", HFArmor.BURLAP, 1, EntityEquipmentSlot.HEAD);
		resin_burlap_boots = new HFArmor("resin_burlap_boots", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.FEET);
		resin_burlap_leggings = new HFArmor("resin_burlap_leggings", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.LEGS);
		resin_burlap_chestplate = new HFArmor("resin_burlap_chestplate", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.CHEST);
		resin_burlap_helmet = new HFArmor("resin_burlap_helmet", HFArmor.RESIN_BURLAP, 1, EntityEquipmentSlot.HEAD);
		//Weapons
		resin_sword = new HFSword("resin_sword", RESIN);
	}
	
	public static void registers(){
		//HempFarmer Icon
		register(icon);
		//Seeds
		register(seeds_hemp);
		register(seeds_indica);
		register(seeds_sativa);
		//Regular Items
		register(raw_hemp);
		register(dry_hemp);
		register(burlap);
		register(oily_burlap);
		register(resin_burlap);
		register(hemp_oil);
		register(resin);
		//Armors
		register(burlap_boots);
		register(burlap_leggings);
		register(burlap_chestplate);
		register(burlap_helmet);
		register(resin_burlap_boots);
		register(resin_burlap_leggings);
		register(resin_burlap_chestplate);
		register(resin_burlap_helmet);
		//Weapons
		register(resin_sword);
		
	}

	public static void register(Item item) {
		GameRegistry.register(item);
	}
	
	public static void registerRenders(){
		//HempFarmer Icon
		registerRender(icon);
		//Seeds
		registerRender(seeds_hemp);
		registerRender(seeds_indica);
		registerRender(seeds_sativa);
		//Regular Items
		registerRender(raw_hemp);
		registerRender(dry_hemp);
		registerRender(burlap);
		registerRender(oily_burlap);
		registerRender(resin_burlap);
		registerRender(hemp_oil);
		registerRender(resin);
		//Armors
		registerRender(burlap_boots);
		registerRender(burlap_leggings);
		registerRender(burlap_chestplate);
		registerRender(burlap_helmet);
		registerRender(resin_burlap_boots);
		registerRender(resin_burlap_leggings);
		registerRender(resin_burlap_chestplate);
		registerRender(resin_burlap_helmet);
		//Weapons
		registerRender(resin_sword);
	}
	
	public static void registerRender(Item item){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
	}
	
	
}
