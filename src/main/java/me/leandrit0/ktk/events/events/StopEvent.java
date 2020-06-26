package me.leandrit0.ktk.events.events;

import org.bukkit.entity.Player;

import me.leandrit0.ktk.events.KillTheKingEvent;

public class StopEvent extends KillTheKingEvent {
     
	public StopEvent(Player player) {
		super(player);				
	}

}
