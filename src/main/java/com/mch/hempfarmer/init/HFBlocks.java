package com.mch.hempfarmer.init;

import com.mch.hempfarmer.block.BlockCropsHemp;
import com.mch.hempfarmer.block.BlockCropsIndica;
import com.mch.hempfarmer.block.BlockCropsSativa;
import com.mch.hempfarmer.block.HFBlock;
import com.mch.hempfarmer.item.HFItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFBlocks extends Blocks{
	

	public static Block hemp_crop;
	public static Block indica_crop;
	public static Block sativa_crop;

	
	
	public static void init(){
		hemp_crop = new BlockCropsHemp("hemp_crop");
		indica_crop = new BlockCropsIndica("indica_crop");
		sativa_crop = new BlockCropsSativa("sativa_crop");
	}
	
	public static void registers(){
		register(hemp_crop);
		register(indica_crop);
		register(sativa_crop);
	}
	
	public static void register(Block block){
	GameRegistry.register(block);
	ItemBlock iBlock = new ItemBlock(block);
    GameRegistry.register(iBlock, block.getRegistryName());
	}
	
	public static void registerRenders(){
		registerRender(hemp_crop);
		registerRender(indica_crop);
		registerRender(sativa_crop);

	}
	
	public static void registerRender(Block block){
		Item item = new Item().getItemFromBlock(block);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
	}

}
