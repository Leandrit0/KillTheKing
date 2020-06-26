package me.leandrit0.ktk.events.events;

import lombok.Getter;
import org.bukkit.entity.Player;

import me.leandrit0.ktk.events.KillTheKingEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.logging.Handler;

public class StopEvent extends Event {

	@Getter private final Player player;

	private final HandlerList handlerList = new HandlerList();

	public StopEvent(Player player) {
		this.player = player;
	}

	@Override
	public HandlerList getHandlers() {
		return handlerList;
	}
}
