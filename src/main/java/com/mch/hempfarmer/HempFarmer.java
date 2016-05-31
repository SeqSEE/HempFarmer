package com.mch.hempfarmer;

import com.mch.hempfarmer.config.HFConfig;
import com.mch.hempfarmer.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VER)
public class HempFarmer{
	
	public static Configuration config;
	@Instance(value = "hempfarmer")
    public static HempFarmer instance;
	
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

    
}
