package com.mch.hempfarmer.init;

import net.minecraft.item.ItemStack;
import net.silentchaos512.funores.api.FunOresAPI;

public class ExternalRecipes {
	
	public static void registerFunOres(){
		FunOresAPI.addDryingRackRecipe(new ItemStack(HFItems.dry_hemp), 4000, 0.2F, new ItemStack(HFItems.raw_hemp));
		FunOresAPI.addDryingRackRecipe(new ItemStack(HFItems.lime_dry_hemp), 4000, 0.2F, new ItemStack(HFItems.lime_raw_hemp));
		FunOresAPI.addDryingRackRecipe(new ItemStack(HFItems.violet_dry_hemp), 4000, 0.2F, new ItemStack(HFItems.violet_raw_hemp));
	}
	
	
}
