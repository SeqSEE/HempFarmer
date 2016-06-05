package com.mch.hempfarmer.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFRecipes {
	
	public static void registerRecipes(FMLPreInitializationEvent preEvent){		
		//Dried Hemp//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.raw_hemp),
				new ItemStack(HFItems.dry_hemp), 0.1F);
		//Hemp Resin//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.hemp_oil),
				new ItemStack(HFItems.resin), 0.1F);
		//Resin Burlap//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.oily_burlap),
				new ItemStack(HFItems.resin_burlap), 0.1F);
		//Oily Burlap//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.oily_burlap),
				new ItemStack(HFItems.burlap), new ItemStack(HFItems.hemp_oil));
		//Burlap//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap),
				" hh",
				" hh",
				"   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap),
				"hh ",
				"hh ", 
				"   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap),
				"   ",
				"hh ",
				"hh ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap),
				"   ",
				" hh",
				" hh", 'h', new ItemStack(HFItems.dry_hemp));
		//Vanilla Lead//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Items.LEAD),
				"ss ",
				"sr ", 
				"  s", 'r', new ItemStack(HFItems.resin), 's', new ItemStack(Items.STRING));
		GameRegistry.addRecipe(new ItemStack(Items.LEAD),
				"hh ",
				"hr ",
				"  h", 'r', new ItemStack(HFItems.resin), 'h', new ItemStack(HFItems.dry_hemp));
		//Hemp Oil//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.hemp_oil),
				"sss",
				"gsg", 
				" g ", 'g', new ItemStack(Blocks.GLASS), 's', new ItemStack(HFItems.seeds_hemp));
		//Burlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_boots),
				"   ",
				"b b", 
				"b b", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_chestplate),
				"b b",
				"bbb",
				"bbb", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFItems.burlap));
		//Resin Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_boots),
				"   ",
				"r r",
				"r r", 'r', new ItemStack(HFItems.resin));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_leggings),
				"rrr",
				"r r",
				"r r", 'r', new ItemStack(HFItems.resin));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_chestplate),
				"r r", 
				"rrr", 
				"rrr", 'r', new ItemStack(HFItems.resin));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_helmet),
				"rrr",
				"r r",
				"   ", 'r', new ItemStack(HFItems.resin));
		//Resin Burlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_boots),
				"   ",
				"b b",
				"b b", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_chestplate), 
				"b b",
				"bbb", 
				"bbb", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFItems.resin_burlap));
		//Resin Sword//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_sword),
				" r ", 
				" r ", 
				" s ", 'r', new ItemStack(HFItems.resin), 's', new ItemStack(Items.STICK));
		//Resin Shield//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_shield),
				"rrr",
				"rrr",
				" r ", 'r', new ItemStack(HFItems.resin));
		//Pot Brownies//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.pot_brownie),
				new ItemStack(Items.EGG), new ItemStack(Items.SUGAR),
				new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.DYE, 1, 3),
				new ItemStack(HFItems.bud), new ItemStack(HFItems.bud), new ItemStack(HFItems.bud) );
		//Joints//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.regs_joint),
				new ItemStack(Items.PAPER), new ItemStack(HFItems.bud),
				new ItemStack(HFItems.bud), new ItemStack(HFItems.bud));
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.indica_joint),
				new ItemStack(Items.PAPER), new ItemStack(HFItems.indica_bud),
				new ItemStack(HFItems.indica_bud), new ItemStack(HFItems.indica_bud));
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.sativa_joint),
				new ItemStack(Items.PAPER), new ItemStack(HFItems.sativa_bud),
				new ItemStack(HFItems.sativa_bud), new ItemStack(HFItems.sativa_bud));
		//Seedlings//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.hemp_crop),
				new ItemStack(HFItems.seeds_hemp));
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.indica_crop),
				new ItemStack(HFItems.seeds_indica));
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.sativa_crop),
				new ItemStack(HFItems.seeds_sativa));
	}
}
