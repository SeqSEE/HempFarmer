package com.mch.hempfarmer.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.Reference;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class VersionChecker implements Runnable {
	
    
    private static String latestRev;
    
    public static void check(FMLPostInitializationEvent postEvent) {
    	if (HempFarmer.getUpdates == true){
    		HempFarmer.versionChecker = new VersionChecker();
        	Thread versionCheckThread = new Thread(HempFarmer.versionChecker);
        	versionCheckThread.start();
        }
    }

    @Override
    public void run() {
    	
    	
    	if (Networking.networkAvailable()){
    		InputStream versionFile = null;
    		try{
    			versionFile = new URL("https://raw.githubusercontent.com/SeqSEE/HempFarmer/master/latest").openStream();
    		} 
    		catch (MalformedURLException e) {
    			e.printStackTrace();
    		} 
    		catch (IOException e) {
    			e.printStackTrace();
    		}
    		try {
    			latestRev = IOUtils.readLines(versionFile).get(0);
    		} 
    		catch (IOException e) {
    			e.printStackTrace();
    		} 
    		finally {
    			IOUtils.closeQuietly(versionFile);
    		}
    		HempFarmer.latest = latestRev;
    		System.out.println("Latest " + Reference.NAME + " version:" + latestRev);
    		HempFarmer.isLatest = Reference.VER.equals(latestRev);
    		String output = HempFarmer.isLatest == true ? "You are running the latest version." : "You are running:" + Reference.VER + "    You are running a different version!";
    		System.out.println(output);
    	}
    	else {
    		System.out.println("No network/Network error");
    		System.out.println("Skipping HempFarmer updates.");
    	}
        
    }
    
    public boolean isLatestVersion() {
     return HempFarmer.isLatest;
    }
    
    public String getLatestVersion() {
     return latestRev;
    }
    
    public static boolean getWarning(PlayerTickEvent event) {
    	boolean warned = HempFarmer.warned;
    	if (!warned && event.player.worldObj.isRemote && HempFarmer.isLatest == false && HempFarmer.getUpdates != false){
            TextComponentString update = new TextComponentString("[Update to " + latestRev + "]");
            Style link = new Style();
            link.setBold(true);
           	link.setUnderlined(true);
           	link.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("Click here to visit the Curse page.")));
           	link.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://mods.curse.com/mc-mods/minecraft/245575-hempfarmer"));
            update.setStyle(link);
            event.player.addChatMessage(new TextComponentString("Your HempFarmer Mod is not the recommended version!"));
            event.player.addChatMessage(update);
            HempFarmer.warned = true;
    	}
    	return warned;
    }
}