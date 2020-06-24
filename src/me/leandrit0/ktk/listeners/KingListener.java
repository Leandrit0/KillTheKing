package me.leandrit0.ktk.listeners;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.leandrit0.ktk.Main;
import me.leandrit0.ktk.events.type.Start;
import me.leandrit0.ktk.events.type.Stop;

public class KingListener implements Listener {
	@EventHandler
	public void onCreate(Start e) {		
		Bukkit.broadcastMessage(ChatColor.GREEN + e.getPlayer().getName() + " is the king.");
	}
	@EventHandler
	public void onCancel(Stop e) {
		Bukkit.broadcastMessage(ChatColor.GREEN + "Kill The King has been cancelled.");
	}
	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		Player king = Main.plugin.kingManager.getKing();
		if (p == king) {
			Bukkit.broadcastMessage(ChatColor.RED + "The King has changed to " + p.getKiller().getName());
			Main.plugin.kingManager.setKing(p.getKiller());
		} else {
			return;
		}
	}
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		Player king = Main.plugin.kingManager.king;
		if (p == king) {
			Random random = Main.plugin.random;
			Player random1 = Bukkit.getOnlinePlayers()[(new Random()).nextInt(Bukkit.getOnlinePlayers().length)];
			Bukkit.broadcastMessage(ChatColor.GREEN + "The new king is " + random1.getName());
			Main.plugin.kingManager.setKing(random1);
		}
		
	}
	

}
