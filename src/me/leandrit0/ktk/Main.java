package me.leandrit0.ktk;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.leandrit0.ktk.listeners.KingListener;
import me.leandrit0.ktk.manager.KingManager;
import me.leandrit0.ktk.utils.command.CommandRegistrer;

public class Main extends JavaPlugin {

	@Getter public static Main plugin;
	public  KingManager kingManager;
	public Random random;
	
	public void onEnable() {
		plugin = this;
        new CommandRegistrer();
        Bukkit.getPluginManager().registerEvents(new KingListener(), this);
	}
	
	public void onDisable() {
		plugin = null;
	}
	
}
