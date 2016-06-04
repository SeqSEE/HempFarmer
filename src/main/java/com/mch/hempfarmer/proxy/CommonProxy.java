package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.init.HFRecipes;
import com.mch.hempfarmer.util.VersionChecker;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent){
		register(preEvent);		
	}

	public void init(FMLInitializationEvent event){
		registerRender(event);
	}
	public void postInit(FMLPostInitializationEvent postEvent){
		VersionChecker.check(postEvent);
	}
	
	public void register(FMLPreInitializationEvent preEvent){
		HFBlocks.register();
		HFItems.register();
		HFRecipes.registerRecipes();
	}
	
	public void registerRender(FMLInitializationEvent event){
		//DO NOT REGISTER RENDER HERE!!!
	}



}
