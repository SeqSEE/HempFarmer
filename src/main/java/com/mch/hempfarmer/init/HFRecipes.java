package com.mch.hempfarmer.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HFRecipes {
	
	public static void registerRecipes(){		
		//Dried Hemp//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.raw_hemp), new ItemStack(HFItems.dry_hemp), 0.1F);
		//Hemp Resin//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.hemp_oil), new ItemStack(HFItems.resin), 0.1F);
		//Resin Burlap//- Smelting Recipe
		GameRegistry.addSmelting(new ItemStack(HFItems.oily_burlap), new ItemStack(HFItems.resin_burlap), 0.1F);
		//Oily Burlap//- Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(HFItems.oily_burlap), new ItemStack(HFItems.burlap), new ItemStack(HFItems.hemp_oil));
		//Burlap//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap), " hh", " hh", "   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap), "hh ", "hh ", "   ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap), "   ", "hh ", "hh ", 'h', new ItemStack(HFItems.dry_hemp));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap), "   ", " hh", " hh", 'h', new ItemStack(HFItems.dry_hemp));
		//Vanilla Lead//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Items.LEAD), "ss ", "sr ", "  s", 'r', new ItemStack(HFItems.resin), 's', new ItemStack(Items.STRING));
		GameRegistry.addRecipe(new ItemStack(Items.LEAD), "hh ", "hr ", "  h", 'r', new ItemStack(HFItems.resin), 'h', new ItemStack(HFItems.dry_hemp));
		//Hemp Oil//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.hemp_oil), "sss", "gsg", " g ", 'g', new ItemStack(Blocks.GLASS), 's', new ItemStack(HFItems.seeds_hemp));
		//Burlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_boots), "   ", "b b", "b b", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_leggings), "bbb", "b b", "b b", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_chestplate), "b b", "bbb", "bbb", 'b', new ItemStack(HFItems.burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.burlap_helmet), "bbb", "b b", "   ", 'b', new ItemStack(HFItems.burlap));
		//Resin Burlap Armor//- Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_boots), "   ", "b b", "b b", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_leggings), "bbb", "b b", "b b", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_chestplate), "b b", "bbb", "bbb", 'b', new ItemStack(HFItems.resin_burlap));
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_burlap_helmet), "bbb", "b b", "   ", 'b', new ItemStack(HFItems.resin_burlap));
		//Resin Sword//- Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(HFItems.resin_sword), " r ", " r ", " s ", 'r', new ItemStack(HFItems.resin), 's', new ItemStack(Items.STICK));

	}
}
