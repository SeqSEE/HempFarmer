package com.mch.hempfarmer.util;

import com.mch.hempfarmer.HempFarmer;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	
	public static void sync() {
	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
		if (HempFarmer.config.hasChanged()) {
			HempFarmer.config.save();
		}
	}

	public static void config(FMLPreInitializationEvent preEvent) {
		HempFarmer.config = new Configuration(preEvent.getSuggestedConfigurationFile());
		HempFarmer.config.load();
    	boolean updates = HempFarmer.config.getBoolean("Check for updates:", "Updates", true, "Whether to check for an updated Mod.");
    	HempFarmer.getUpdates = updates;
    	boolean drugs = HempFarmer.config.getBoolean("Enable Drugs:", "Drugs", true, "Whether to enable drugs at all.");
    	HempFarmer.drugs = drugs;
    	boolean drugsCraft = HempFarmer.config.getBoolean("Enable Crafting Drugs:", "Drugs", true, "Whether to enable crafting drugs.");
    	HempFarmer.drugsCrafting = drugsCraft;
    	HempFarmer.config.save();
     	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
		Config.sync();	
	}
}
