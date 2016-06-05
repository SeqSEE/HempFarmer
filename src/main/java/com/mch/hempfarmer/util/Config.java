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
    	HempFarmer.config.save();
     	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
		Config.sync();	
	}
}
