package me.leandrit0.ktk.listeners;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.leandrit0.ktk.KillTheKing;
import me.leandrit0.ktk.events.events.StartEvent;
import me.leandrit0.ktk.events.events.StopEvent;

public class KingListener implements Listener {

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		if (player.equals(KillTheKing.getInstance().getKingManager().getKing())) {
			Bukkit.broadcastMessage(ChatColor.RED + "The King Has Been Changed To " + player.getKiller().getName());
			KillTheKing.getInstance().getKingManager().setKing(player.getKiller());
		}
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		if (player.equals(KillTheKing.getInstance().getKingManager().getKing())) {
			Player newKing = Bukkit.getOnlinePlayers()[(new Random()).nextInt(Bukkit.getOnlinePlayers().length)];
			KillTheKing.getInstance().getKingManager().setKing(newKing);
			Bukkit.broadcastMessage(ChatColor.GREEN + "The New King Is " + newKing.getName());
		}
	}

	@EventHandler
	public void onCreate(StartEvent event) {
		KillTheKing.getInstance().getKingManager().setKing(event.getPlayer());
		Bukkit.broadcastMessage(ChatColor.GREEN + event.getPlayer().getName() + " Is The King.");
	}

	@EventHandler
	public void onCancel(StopEvent event) {
		Bukkit.broadcastMessage(ChatColor.GREEN + "The Kill The King Event Has Been Cancelled.");
	}
}
