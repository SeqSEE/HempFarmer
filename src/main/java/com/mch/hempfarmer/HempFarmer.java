package com.mch.hempfarmer;

import com.mch.hempfarmer.proxy.CommonProxy;
import com.mch.hempfarmer.util.Config;
import com.mch.hempfarmer.util.VersionChecker;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
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

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VER)
public class HempFarmer{
	
	public static Configuration config;
	@Instance(value = "hempfarmer")
    public static HempFarmer instance;
	public static VersionChecker versionChecker;
	public static boolean getUpdates;
	public static String latest;
	public static boolean isLatest = false;
	public static boolean warned = false;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
    	config = new Configuration(preEvent.getSuggestedConfigurationFile());
    	config.load();
    	boolean updates = config.getBoolean("Check for updates:", "Updates", true, "Whether to check for an updated Mod.");
    	getUpdates = updates;
    	config.save();
    	 
    	
    	MinecraftForge.EVENT_BUS.register(instance);
		Config.sync();
    	proxy.preInit(preEvent);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){
    	if (getUpdates == true){
		HempFarmer.versionChecker = new VersionChecker();
    	Thread versionCheckThread = new Thread(HempFarmer.versionChecker, "HempFarmer - VersionChecker");
    	versionCheckThread.start();
    	}
    }
    
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(PlayerTickEvent event){
    	VersionChecker.getWarning(event); 
      
    }

    
}
