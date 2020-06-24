package me.leandrit0.ktk.events.type;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import me.leandrit0.ktk.events.KillTheKingEvent;

public class Start extends KillTheKingEvent implements Cancellable {

	private boolean cancelled;
	
	public Start(Player player) {
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
