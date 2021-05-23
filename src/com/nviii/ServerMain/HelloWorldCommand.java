package com.nviii.ServerMain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloWorldCommand implements CommandExecutor{
	private Main plugin;
	
	public HelloWorldCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Hello").setExecutor(this);
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only Players may execute this command!");
			return true;
		}
		Player p = (Player) sender;
		
		if(p.hasPermission("hello.use")) {
			p.sendMessage("Hello there!");
			p.sendMessage("Ah General Kenobi... You are a bold one");
			return true;
		} 
		
		else {
			p.sendMessage("you do not have permission nerd.");
			p.sendMessage("get a life dude.");
		}
		
		return false;
		
		
	}
}