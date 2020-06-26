package me.leandrit0.ktk.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import me.leandrit0.ktk.manager.KingManager;

public class KillTheKingEvent extends Event {

	@Getter private final Player player;

	@Getter
	private final HandlerList handlers = new HandlerList();

	public KillTheKingEvent(Player player) {
		this.player = player;
	}

}
