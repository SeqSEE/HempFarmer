package com.mch.hempfarmer.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

public class HFOreDictionary extends OreDictionary{
	
	public static void init(FMLInitializationEvent event){
		
		//crop
		registerOre("cropCannibis",     new ItemStack(HFItems.raw_hemp, 1, WILDCARD_VALUE));
		registerOre("cropCannibis",     new ItemStack(HFItems.violet_raw_hemp, 1, WILDCARD_VALUE));
		registerOre("cropCannibis",     new ItemStack(HFItems.lime_raw_hemp, 1, WILDCARD_VALUE));
		registerOre("cropBud",     new ItemStack(HFItems.bud, 1, WILDCARD_VALUE));
		registerOre("cropBud",     new ItemStack(HFItems.indica_bud, 1, WILDCARD_VALUE));
		registerOre("cropBud",     new ItemStack(HFItems.sativa_bud, 1, WILDCARD_VALUE));
		
		//dry hemp
		registerOre("dryHemp",     new ItemStack(HFItems.dry_hemp, 1, WILDCARD_VALUE));
		registerOre("dryHemp",     new ItemStack(HFItems.violet_dry_hemp, 1, WILDCARD_VALUE));
		registerOre("dryHemp",     new ItemStack(HFItems.lime_dry_hemp, 1, WILDCARD_VALUE));
		
		//dirt
		registerOre("dirt",     new ItemStack(HFBlocks.oily_dirt, 1, WILDCARD_VALUE));
		registerOre("dirt",     new ItemStack(HFBlocks.resin_dirt, 1, WILDCARD_VALUE));
		registerOre("dirt",     new ItemStack(HFBlocks.violet_dirt, 1, WILDCARD_VALUE));
		registerOre("dirt",     new ItemStack(HFBlocks.lime_dirt, 1, WILDCARD_VALUE));
		registerOre("dirt",		new ItemStack(Blocks.DIRT, 1, WILDCARD_VALUE));
		
		//burlap 
		registerOre("bulap",     new ItemStack(HFBlocks.burlap, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.oily_burlap, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.resin_burlap, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.violet_burlap, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.lime_burlap, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.burlap_block, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.oily_burlap_block, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.resin_burlap_block, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.violet_burlap_block, 1, WILDCARD_VALUE));
		registerOre("bulap",     new ItemStack(HFBlocks.lime_burlap_block, 1, WILDCARD_VALUE));

		//misc
		registerOre("paper",     new ItemStack(HFItems.hemp_paper, 1, WILDCARD_VALUE));
	
	}

}
