package me.leandrit0.ktk.events.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import me.leandrit0.ktk.events.KillTheKingEvent;

public class StartEvent extends KillTheKingEvent implements Cancellable {

	private boolean cancelled;
	
	public StartEvent(Player player) {
		super(player);
		this.setCancelled(false);
	
	}

	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
		
	}

}
