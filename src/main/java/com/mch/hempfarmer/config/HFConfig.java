package com.mch.hempfarmer.config;

import java.io.File;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.Reference;

import net.minecraftforge.common.MinecraftForge;

public class HFConfig {
	
	public static void sync(){
	MinecraftForge.EVENT_BUS.register(HempFarmer.instance);
	
	
	if (HempFarmer.config.hasChanged()) {
		HempFarmer.config.save();
	}
	}
}
