package com.mch.hempfarmer;

import com.mch.hempfarmer.config.HFConfig;
import com.mch.hempfarmer.proxy.CommonProxy;

import net.minecraft.client.gui.ChatLine;
import net.minecraft.init.Blocks;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Chat;
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
	public static boolean isLatest = false;
	public static boolean warned = false;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
    	config = new Configuration(preEvent.getSuggestedConfigurationFile());
    	  try{
    	      config.load();
    	    }
    	    catch (Exception e){
    	      throw new RuntimeException(e);
    	    }
    	    finally
    	    {
    	      if (config.hasChanged())
    	      {
    	        config.save();
    	      }
    	    }
    	    MinecraftForge.EVENT_BUS.register(instance);
    	    HFConfig.sync();
    	proxy.preInit(preEvent);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){
		HempFarmer.versionChecker = new VersionChecker();
    	Thread versionCheckThread = new Thread(HempFarmer.versionChecker, "Version Check");
    	versionCheckThread.start();
    }
    
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(PlayerTickEvent event){
    	
    	if (!warned && event.player.worldObj.isRemote && isLatest == false){
            TextComponentString update = new TextComponentString("[Update HempFarmer]");
            Style link = new Style();
            link.setBold(true);
           	link.setUnderlined(true);
           	link.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("Click here to visit the Curse page.")));
           	link.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://mods.curse.com/mc-mods/minecraft/245575-hempfarmer"));
            update.setStyle(link);
            event.player.addChatMessage(new TextComponentString("Your HempFarmer Mod is not the latest version!"));
            event.player.addChatMessage(update);
            warned = true;
    	}
 
      
    }

    
}
