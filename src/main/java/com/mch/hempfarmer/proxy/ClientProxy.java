package com.mch.hempfarmer.proxy;

import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.util.Config;
import com.mch.hempfarmer.util.VersionChecker;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
		super.postInit(postEvent);
	}
	
	@Override
	public void registerRender(FMLInitializationEvent event) {
		HFItems.registerRender(event);
		HFBlocks.registerRender(event);
	}

	@Override
	public void VersionCheck(PlayerTickEvent event) {
		VersionChecker.getWarning(event);
	}
	
}
