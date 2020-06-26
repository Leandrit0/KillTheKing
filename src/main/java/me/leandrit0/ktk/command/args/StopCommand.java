package me.leandrit0.ktk.command.args;

import me.leandrit0.ktk.events.events.StopEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.leandrit0.ktk.KillTheKing;
import me.leandrit0.ktk.utils.command.CommandArgument;

public class StopCommand extends CommandArgument {

	public StopCommand(KillTheKing plugin) {
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
		
		StopEvent event = new StopEvent(KillTheKing.getInstance().getKingManager().getKing());
		Bukkit.getPluginManager().callEvent(event);
		KillTheKing.getInstance().getKingManager().setKing(null);
		sender.sendMessage(ChatColor.RED + "Kill The King has been cancelled.");
		
		return true;
	}

}

