package com.mch.hempfarmer.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.Reference;

public class VersionChecker implements Runnable{
	
    
    private static String latest = "";

    @Override
    public void run(){
        InputStream versionFile = null;
        try{
        	versionFile = new URL("https://raw.githubusercontent.com/SeqSEE/HempFarmer/master/latest").openStream();
        } 
        catch 
        (MalformedURLException e){
            e.printStackTrace();
        } 
        catch (IOException e){
            e.printStackTrace();
        }

        try{
            latest = IOUtils.readLines(versionFile).get(0);
        } 
        catch (IOException e){

            e.printStackTrace();
        } 
        finally{
            IOUtils.closeQuietly(versionFile);
        }
        System.out.println("Latest " + Reference.NAME + " version:" + latest);
        HempFarmer.isLatest = Reference.VER.equals(latest);
        String output = HempFarmer.isLatest == true ? "You are running the latest version." : "You are running:" + Reference.VER + " This is an old version!";
        System.out.println(output);
    }
    
    public boolean isLatestVersion(){
     return HempFarmer.isLatest;
    }
    
    public String getLatestVersion(){
     return latest;
    }
}