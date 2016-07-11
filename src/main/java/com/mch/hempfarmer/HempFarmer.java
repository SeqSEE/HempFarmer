package com.mch.hempfarmer;

import com.mch.hempfarmer.proxy.CommonProxy;
import com.mch.hempfarmer.util.Config;
import com.mch.hempfarmer.util.VersionChecker;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VER)
public class HempFarmer {
	
	public static Configuration config;
	@Instance(value = "hempfarmer")
    public static HempFarmer instance;
	public static VersionChecker versionChecker;
	public static boolean configSynced = false;
	public static boolean getUpdates = true;
	public static String latest;
	public static boolean isLatest = false;
	public static boolean warned = false;
	public static boolean drugsCrafting = true;
	public static boolean drugs = true;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    private static CommonProxy proxy;
	
    @EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
    	proxy.preInit(preEvent);
    }
    
    @EventHandler
    private void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
    private void postInit(FMLPostInitializationEvent postEvent) {
    	proxy.postInit(postEvent);
    }
    
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onPlayerTick(PlayerTickEvent event) {
    	proxy.VersionCheck(event);
    }
    
    
}
