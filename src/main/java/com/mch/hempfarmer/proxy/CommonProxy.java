package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.init.HFRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		register();		
	}

	public void init(FMLInitializationEvent event) {
		registerRender();
	}
	
	public void register(){
		HFBlocks.register();
		HFItems.register();
		HFRecipes.registerRecipes();
	}
	
	public void registerRender(){
		//DO NOT REGISTER RENDER HERE!!!
	}

}
