package com.mch.hempfarmer.init;

import com.mch.hempfarmer.HempFarmer;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class HFRecipes {
	
	public static void registerRecipes(FMLPreInitializationEvent preEvent){		
		//Dried Hemp//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.raw_hemp),
				new ItemStack(HFItems.dry_hemp), 0.1F);
		//LimeDried Hemp//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.lime_raw_hemp),
				new ItemStack(HFItems.lime_dry_hemp), 0.1F);
		//VioletDried Hemp//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.violet_raw_hemp),
				new ItemStack(HFItems.violet_dry_hemp), 0.1F);
		//Hemp Resin//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.hemp_oil),
				new ItemStack(HFItems.resin), 0.1F);
		//Resin Burlap//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFBlocks.oily_burlap),
				new ItemStack(HFBlocks.resin_burlap), 0.1F);
		//Oily Burlap//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.oily_burlap),
				new ItemStack(HFBlocks.burlap), new ItemStack(HFItems.hemp_oil));
		//Burlap//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFBlocks.burlap),
				" hh",
				" hh",
				"   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.burlap),
				"hh ",
				"hh ", 
				"   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.burlap),
				"   ",
				"hh ",
				"hh ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.burlap),
				"   ",
				" hh",
				" hh", 'h', new ItemStack(HFItems.dry_hemp));
		//LimeBurlap//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFBlocks.lime_burlap),
				" hh",
				" hh",
				"   ", 'h', new ItemStack(HFItems.lime_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.lime_burlap),
				"hh ",
				"hh ", 
				"   ", 'h', new ItemStack(HFItems.lime_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.lime_burlap),
				"   ",
				"hh ",
				"hh ", 'h', new ItemStack(HFItems.lime_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.lime_burlap),
				"   ",
				" hh",
				" hh", 'h', new ItemStack(HFItems.lime_dry_hemp));
		//VioletBurlap//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFBlocks.violet_burlap),
				" hh",
				" hh",
				"   ", 'h', new ItemStack(HFItems.violet_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.violet_burlap),
				"hh ",
				"hh ", 
				"   ", 'h', new ItemStack(HFItems.violet_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.violet_burlap),
				"   ",
				"hh ",
				"hh ", 'h', new ItemStack(HFItems.violet_dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFBlocks.violet_burlap),
				"   ",
				" hh",
				" hh", 'h', new ItemStack(HFItems.violet_dry_hemp));
		//Vanilla Lead//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Items.LEAD),
				"ss ",
				"sr ", 
				"  s", 'r', new ItemStack(HFItems.resin), 's', new ItemStack(Items.STRING));
		GameRegistry.addRecipe(new ItemStack(Items.LEAD),
				"hh ",
				"hr ",
				"  h", 'r', new ItemStack(HFItems.resin), 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(Items.LEAD),
				"hh ",
				"hs ",
				"  h", 's', new ItemStack(Items.SLIME_BALL), 'h', new ItemStack(HFItems.dry_hemp));
		//Hemp Oil//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.hemp_oil),
				"sss",
				"gsg", 
				" g ", 'g', new ItemStack(Blocks.GLASS), 's', new ItemStack(HFItems.seeds_hemp));
		//Burlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_boots),
				"   ",
				"b b", 
				"b b", 'b', new ItemStack(HFBlocks.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFBlocks.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_chestplate),
				"b b",
				"bbb",
				"bbb", 'b', new ItemStack(HFBlocks.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFBlocks.burlap));
		//LimeBurlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.lime_burlap_boots),
				"   ",
				"b b", 
				"b b", 'b', new ItemStack(HFBlocks.lime_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.lime_burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFBlocks.lime_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.lime_burlap_chestplate),
				"b b",
				"bbb",
				"bbb", 'b', new ItemStack(HFBlocks.lime_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.lime_burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFBlocks.lime_burlap));
		//VioletBurlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.violet_burlap_boots),
				"   ",
				"b b", 
				"b b", 'b', new ItemStack(HFBlocks.violet_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.violet_burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFBlocks.violet_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.violet_burlap_chestplate),
				"b b",
				"bbb",
				"bbb", 'b', new ItemStack(HFBlocks.violet_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.violet_burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFBlocks.violet_burlap));
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
		//ResinBurlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_boots),
				"   ",
				"b b",
				"b b", 'b', new ItemStack(HFBlocks.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_leggings),
				"bbb",
				"b b",
				"b b", 'b', new ItemStack(HFBlocks.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_chestplate), 
				"b b",
				"bbb", 
				"bbb", 'b', new ItemStack(HFBlocks.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_helmet),
				"bbb",
				"b b",
				"   ", 'b', new ItemStack(HFBlocks.resin_burlap));
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
		//Seedlings//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.hemp_crop),
			new ItemStack(HFItems.seeds_hemp));
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.indica_crop),
			new ItemStack(HFItems.seeds_indica));
		GameRegistry.addShapelessRecipe(new ItemStack(HFBlocks.sativa_crop),
			new ItemStack(HFItems.seeds_sativa));
		
		
		if (HempFarmer.drugs == true && HempFarmer.drugsCrafting == true){
		//Pot Brownies//- Shapeless Recipe
			GameRegistry.addShapelessRecipe(new ItemStack(HFItems.pot_brownie),
				new ItemStack(Items.EGG), new ItemStack(Items.SUGAR),
				new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.DYE, 1, 3),
				new ItemStack(HFItems.bud), new ItemStack(HFItems.indica_bud), new ItemStack(HFItems.sativa_bud) );
		//Rolling Paper//- Shapeless Recipe
			GameRegistry.addShapelessRecipe(new ItemStack(HFItems.rolling_paper, 3),
				new ItemStack(Items.PAPER));
		//Joints//- Shapeless Recipe
			GameRegistry.addShapelessRecipe(new ItemStack(HFItems.regs_joint),
				new ItemStack(HFItems.rolling_paper), new ItemStack(HFItems.bud),
				new ItemStack(HFItems.bud), new ItemStack(HFItems.bud));
			GameRegistry.addShapelessRecipe(new ItemStack(HFItems.indica_joint),
				new ItemStack(HFItems.rolling_paper), new ItemStack(HFItems.indica_bud),
				new ItemStack(HFItems.indica_bud), new ItemStack(HFItems.indica_bud));
			GameRegistry.addShapelessRecipe(new ItemStack(HFItems.sativa_joint),
				new ItemStack(HFItems.rolling_paper), new ItemStack(HFItems.sativa_bud),
				new ItemStack(HFItems.sativa_bud), new ItemStack(HFItems.sativa_bud));
		}
	//Register Fun Ores Recipes
		if (Loader.isModLoaded("FunOres")) {
			ExternalRecipes.registerFunOres();
		}
	}
}
