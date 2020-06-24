package me.leandrit0.ktk.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import me.leandrit0.ktk.manager.KingManager;

public class KillTheKingEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	@Getter private Player player;
	
	
	public KillTheKingEvent(Player player) {
		this.player = player;
		
	}
	
	@Override
	public HandlerList getHandlers() {
		
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

}
