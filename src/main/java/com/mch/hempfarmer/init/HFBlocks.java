package com.mch.hempfarmer.init;

import java.util.ArrayList;
import java.util.List;

import com.mch.hempfarmer.block.burlap.BlockBurlap;
import com.mch.hempfarmer.block.burlap.OilyBurlap;
import com.mch.hempfarmer.block.cannibis.Hemp;
import com.mch.hempfarmer.block.cannibis.Indica;
import com.mch.hempfarmer.block.cannibis.Sativa;
import com.mch.hempfarmer.item.HFItem;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFBlocks extends Blocks{
	
	public static List<Item> items = new ArrayList();

	public static List<Block> blocks = new ArrayList();
	
	public static Block burlap = new BlockBurlap("burlap");
	public static Block oily_burlap = new OilyBurlap("oily_burlap");
	public static Block resin_burlap = new BlockBurlap("resin_burlap");
	public static Block lime_burlap = new BlockBurlap("lime_burlap");
	public static Block violet_burlap = new BlockBurlap("violet_burlap");
	public static Block hemp_crop = new Hemp("hemp_crop");
	public static Block indica_crop = new Indica("indica_crop");
	public static Block sativa_crop = new Sativa("sativa_crop");
	
	public static List<Block> blockList(){
		return blocks;		
	}
	
	public static void register(FMLPreInitializationEvent preEvent){
		for (Block block : blockList()){
			ItemBlock iBlock = new ItemBlock(block);
			if (block.getRegistryName().toString().endsWith("_crop")){
				iBlock.setMaxStackSize(1);
			}
			GameRegistry.register(block);
		    GameRegistry.register(iBlock, block.getRegistryName());
		}
	}
	
	public static void registerRender(FMLInitializationEvent event){
		for (Block block : blockList()){
		Item item = new Item().getItemFromBlock(block);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
		}
	}
}
