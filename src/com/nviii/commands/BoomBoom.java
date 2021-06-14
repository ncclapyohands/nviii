package com.nviii.commands;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.nviii.ServerMain.*;



public class BoomBoom implements Listener, CommandExecutor {
private Main plugin;
	
	public BoomBoom(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("boomboom").setExecutor(this);
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	/*public boolean runBoomBoomCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    
	    return false;
	}
	*/
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if (cmd.getName().equalsIgnoreCase("boomboom")) {
	        Player target = sender.getServer().getPlayer(args[0]);
	         // Make sure the player is online.
	        if (target == null) {
	            sender.sendMessage(args[0] + " is not currently online.");
	            return true;
	        }
	        float explosionPower = 20F; //This is the explosion power - TNT explosions are 4F by default
	        target.getWorld().createExplosion(target.getLocation(), explosionPower);
	        
	    }
		return false;
	}
}
