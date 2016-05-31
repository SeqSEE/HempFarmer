package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void registerRenders(){
		HFItems.registerRenders();
		HFBlocks.registerRenders();
	}

}
