package com.mch.hempfarmer.util;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.block.cannibis.Hemp;
import com.mch.hempfarmer.block.cannibis.Indica;
import com.mch.hempfarmer.block.cannibis.Sativa;

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
    	int hempSeedsGrassRate = HempFarmer.config.getInt("Hemp- Seeds drop rate:", "Drops-Grassseeds", 4, 1, 10, "Weighted drop rate from grass. Wheat is 10 by default.");
    	Hemp.seedsGrassRate = hempSeedsGrassRate;
    	int hempSeedsCropAmount = HempFarmer.config.getInt("Hemp- Seeds drop amount:", "Drops-Seeds", 2, 1, 5, "Amount of seeds to drop from Hemp Crop.");
    	Hemp.seedsCropAmount = hempSeedsCropAmount;
    	int hempHempAmount = HempFarmer.config.getInt("Hemp- Hemp drop amount:", "Drops-Hemp", 2, 1, 5, "Amount of hemp to drop from Hemp Crop.");
    	Hemp.hempAmount = hempHempAmount;
    	int hempBudAmount = HempFarmer.config.getInt("Hemp- Bud drop amount:", "Drops-Buds", 1, 1, 5, "Amount of buds to drop from Hemp Crop.");
    	Hemp.budAmount = hempBudAmount;
    	int indicaSeedsGrassRate = HempFarmer.config.getInt("Indica- Seeds drop rate:", "Drops-Grassseeds", 1, 1, 10, "Weighted drop rate from grass. Wheat is 10 by default.");
    	Indica.seedsGrassRate = indicaSeedsGrassRate;
    	int indicaSeedsCropAmount = HempFarmer.config.getInt("Indica- Seeds drop amount:", "Drops-Seeds", 2, 1, 5, "Amount of seeds to drop from Indica Crop.");
    	Indica.seedsCropAmount = indicaSeedsCropAmount;
    	int indicaHempAmount = HempFarmer.config.getInt("Indica- Hemp drop amount:", "Drops-Hemp", 1, 1, 5, "Amount of hemp to drop from Indica Crop.");
    	Indica.hempAmount = indicaHempAmount;
    	int indicaBudAmount = HempFarmer.config.getInt("Indica- Bud drop amount:", "Drops-Buds", 1, 1, 5, "Amount of buds to drop from Indica Crop.");
    	Indica.budAmount = indicaBudAmount;
    	int sativaSeedsGrassRate = HempFarmer.config.getInt("Sativa- Seeds drop rate:", "Drops-Grassseeds", 1, 1, 10, "Weighted drop rate from grass. Wheat is 10 by default");
    	Sativa.seedsGrassRate = sativaSeedsGrassRate;
    	int sativaSeedsCropAmount = HempFarmer.config.getInt("Sativa- Seeds drop amount:", "Drops-Seeds", 2, 1, 5, "Amount of seeds to drop from Sativa Crop.");
    	Sativa.seedsCropAmount = sativaSeedsCropAmount;
    	int sativaHempAmount = HempFarmer.config.getInt("Sativa- Hemp drop amount:", "Drops-Hemp", 1, 1, 5, "Amount of hemp to drop from Sativa Crop.");
    	Sativa.hempAmount = sativaHempAmount;
    	int sativaBudAmount = HempFarmer.config.getInt("Sativa- Bud drop amount:", "Drops-Buds", 1, 1, 5, "Amount of buds to drop from Sativa Crop.");
    	Sativa.budAmount = sativaBudAmount;
    	HempFarmer.config.save();
     	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
		Config.sync();	
	}
}
