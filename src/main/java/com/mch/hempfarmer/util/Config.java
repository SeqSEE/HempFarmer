package com.mch.hempfarmer.util;
	

import com.mch.hempfarmer.HempFarmer;

import net.minecraftforge.common.MinecraftForge;

public class Config {
	
	
	public static void sync(){
	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
	if (HempFarmer.config.hasChanged()) {
		HempFarmer.config.save();
	}
	}
}
