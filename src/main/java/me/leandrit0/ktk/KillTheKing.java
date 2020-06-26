package me.leandrit0.ktk;

import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.leandrit0.ktk.listeners.KingListener;
import me.leandrit0.ktk.manager.KingManager;

@Getter
@Setter
public class KillTheKing extends JavaPlugin {

	@Getter private static KillTheKing instance;
	private KingManager kingManager;

	@Override
	public void onEnable() {
           instance = this;
           Bukkit.getPluginManager().registerEvents(new KingListener(), this);
	}

	@Override
	public void onDisable() {
	    instance = null;
	}
	
}
