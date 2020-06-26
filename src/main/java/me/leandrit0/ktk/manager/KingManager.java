package me.leandrit0.ktk.manager;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.entity.Player;

import lombok.Getter;
import lombok.Setter;

public class KingManager {
	
	@Getter
	@Setter
	private Player king;
	
	public boolean isActive() {
		return king != null;
	}
	
    public double getKingHealth() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	return (double) king.getClass().getMethod("getHealth", double.class).invoke(king);
    }

    public void removeKing(boolean isCancelled) {
    	if (isCancelled) {
    		king = null;
    	}
    }
}
