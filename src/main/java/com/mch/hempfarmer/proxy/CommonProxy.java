package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.init.HFOreDictionary;
import com.mch.hempfarmer.init.HFRecipes;
import com.mch.hempfarmer.util.Config;
import com.mch.hempfarmer.util.Networking;
import com.mch.hempfarmer.util.VersionChecker;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		if (Networking.networkAvailable()){
			VersionChecker.check(preEvent);
	    }
		Config.config(preEvent);
		register(preEvent);		
	}

	public void init(FMLInitializationEvent event) {
		registerRender(event);
		HFOreDictionary.init(event);
	}
		
	public void register(FMLPreInitializationEvent preEvent) {
		HFBlocks.register(preEvent);
		HFItems.register(preEvent);
		HFRecipes.registerRecipes(preEvent);
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
	}
	
	public void registerRender(FMLInitializationEvent event) {
	}

	public void VersionCheck(PlayerTickEvent event) {
		//find out if player has latest version and print it out server side
		
		}

}
