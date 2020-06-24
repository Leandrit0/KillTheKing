package me.leandrit0.ktk.command.args;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import me.leandrit0.ktk.Main;
import me.leandrit0.ktk.events.type.Start;
import me.leandrit0.ktk.utils.command.CommandArgument;

public class Stop extends CommandArgument {

	public Stop(Main plugin) {
		super("stop");
		setRequiresPermission(true);
	}

	@Override public String getUsage(String label) {
        return ChatColor.RED + "/" + label + " " + getName() + " <player>";
    }

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length != 1) {
			sender.sendMessage(getUsage(label));
			return true;
		}
		if (!(sender.hasPermission("king.*"))) {
			sender.sendMessage(ChatColor.RED + "No permission.");
			return true;
		}
		
		me.leandrit0.ktk.events.type.Stop event = new me.leandrit0.ktk.events.type.Stop(Main.plugin.kingManager.king);
		Bukkit.getPluginManager().callEvent(event);
		Main.plugin.kingManager.setKing(null);		
		sender.sendMessage(ChatColor.RED + "Kill The King has been cancelled.");
		
		return true;
	}

}

