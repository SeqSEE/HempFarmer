package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.init.HFRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		HFItems.init();
		HFBlocks.init();
		registers();		
	}

	public void init(FMLInitializationEvent event) {
		registerRenders();
	}
	
	public void registers(){
		HFBlocks.registers();
		HFItems.registers();
		HFRecipes.registerRecipes();
	}
	
	public void registerRenders(){
		//DO NOT REGISTER RENDERS HERE!!!
	}

}
