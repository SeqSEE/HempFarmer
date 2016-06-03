package com.mch.hempfarmer.init;

import java.util.ArrayList;
import java.util.List;

import com.mch.hempfarmer.block.cannibis.Hemp;
import com.mch.hempfarmer.block.cannibis.Indica;
import com.mch.hempfarmer.block.cannibis.Sativa;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFBlocks extends Blocks{
	
	public static List<Block> blocks = new ArrayList();

	public static Block hemp_crop = new Hemp("hemp_crop");
	public static Block indica_crop = new Indica("indica_crop");
	public static Block sativa_crop = new Sativa("sativa_crop");
	
	public static List<Block> blockList(){
		return blocks;		
	}
		
	
	public static void register(){
		for (Block block : blockList()){
			GameRegistry.register(block);
			ItemBlock iBlock = new ItemBlock(block);
		    GameRegistry.register(iBlock, block.getRegistryName());
		}
	}
	
	public static void registerRender(){
		for (Block block : blockList()){
		Item item = new Item().getItemFromBlock(block);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
		}
	}
}
