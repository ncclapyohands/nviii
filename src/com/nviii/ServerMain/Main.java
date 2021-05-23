package com.nviii.ServerMain;

import org.bukkit.plugin.java.JavaPlugin;

import com.nviii.Listeners.JoinListener;

public class Main extends JavaPlugin
{
	
    public void onEnable()
    {
    	saveDefaultConfig();
    	    
        getLogger().info("Nate! Congrats!");
        new HelloWorldCommand(this);
        new JoinListener(this);
       
        
    }

    public void onDisable()
    {
        getLogger().info("C ya later!");
    }



}


