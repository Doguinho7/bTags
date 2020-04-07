package me.doguinho.bTags;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new TagEvent(), this);
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"[bTags] Plugin Ativado!");

	}
	
	public static Main getInstance(){
		return Main.getPlugin(Main.class);
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll();
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"[bTags] Plugin Desativado!");
	}
	
	
	

}