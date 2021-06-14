package com.nviii.ServerMain;

import com.nviii.Listeners.*;
import com.nviii.commands.*;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin
{
	
    public void onEnable()
    {
    	saveDefaultConfig();
    	    
        getLogger().info("Nate! Congrats!");
        new HelloWorldCommand(this);
        new JoinListener(this);
        new BoomBoom(this);
        new Ignite(this);
        
    }

    public void onDisable()
    {
        getLogger().info("C ya later!");
    }



}


