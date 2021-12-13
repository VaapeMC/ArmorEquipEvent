package com.codingforcookies.armorequip;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

/**
 * @Author Borlea
 * @Github https://github.com/borlea/
 * @Website http://codingforcookies.com/
 * @since Jul 30, 2015
 */
public class Main extends JavaPlugin{

	@Override
	public void onEnable(){
		getLogger().info(ChatColor.GREEN + "ArmorEquipEvent has been enabled!");
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new ArmorListener(getConfig().getStringList("blocked")), this);
	}
}