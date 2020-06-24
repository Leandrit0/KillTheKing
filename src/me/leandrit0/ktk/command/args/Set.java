package me.leandrit0.ktk.command.args;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.leandrit0.ktk.Main;
import me.leandrit0.ktk.events.type.Start;
import me.leandrit0.ktk.utils.command.CommandArgument;

public class Set extends CommandArgument {

	public Set(Main plugin) {
		super("set");
		setRequiresPermission(true);
	
	}
	
	@Override public String getUsage(String label) {
        return ChatColor.RED + "/" + label + " " + getName() + " <player>";
    }

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length != 2) {
			sender.sendMessage(getUsage(label));
			return true;
		}
		if (!(sender.hasPermission("king.*"))) {
			sender.sendMessage(ChatColor.RED + "No permission.");
			return true;
		}
		Player target = Bukkit.getPlayer(args[1]);
		if (target == null) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlayer with name '&7" + args[1] + "&c' does not exist."));
		}
		if (target != null) {
		Start event = new Start(target);
		Bukkit.getPluginManager().callEvent(event);
		Main.getPlugin().kingManager.setKing(target);
		sender.sendMessage(ChatColor.GREEN + target.getName() + " has been set to king and now ktk is on.");
		}
		return true;
	}

}
