package me.leandrit0.ktk.command;

import me.leandrit0.ktk.Main;
import me.leandrit0.ktk.command.args.Set;
import me.leandrit0.ktk.command.args.Stop;
import me.leandrit0.ktk.utils.command.ExecutableCommand;

public class KingCommand extends ExecutableCommand {
	
	public KingCommand(Main plugin) {
		super("king");
		this.addArgument(new Set(plugin));
		this.addArgument(new Stop(plugin));
		
	}

}
