package com.mch.hempfarmer.init;

import net.minecraft.item.ItemStack;
import net.silentchaos512.funores.api.FunOresAPI;

public class ExternalRecipes {
	
	public static void registerFunOres(){
		FunOresAPI.addDryingRackRecipe(new ItemStack(HFItems.dry_hemp), 4000, 0.2F, new ItemStack(HFItems.raw_hemp));
	}
}
