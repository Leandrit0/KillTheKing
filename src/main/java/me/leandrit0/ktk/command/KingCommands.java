package me.leandrit0.ktk.command;


import me.leandrit0.ktk.KillTheKing;
import me.leandrit0.ktk.events.events.StartEvent;
import me.leandrit0.ktk.events.events.StopEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KingCommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("killtheking.*")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
            return false;
        }

        switch (args[0].toLowerCase()) {
            case "stop":
                sender.sendMessage(ChatColor.GREEN + "The Kill The King Event Has Been Cancelled.");
                Bukkit.getPluginManager().callEvent(new StopEvent(KillTheKing.getInstance().getKingManager().getKing()));
                break;
            case "set":
                Player target = Bukkit.getPlayer(args[1]);
                if (target == null) return false;
                Bukkit.getPluginManager().callEvent(new StartEvent(target));
                sender.sendMessage(ChatColor.GREEN + target.getName() + " has been set to king and now ktk is on.");
                break;
            default:
                sender.sendMessage(ChatColor.RED + "Unknown command...");
                break;
        }
        return false;
    }
}
