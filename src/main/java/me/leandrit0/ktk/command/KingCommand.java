package me.leandrit0.ktk.command;

import me.leandrit0.ktk.KillTheKing;
import me.leandrit0.ktk.command.args.SetCommand;
import me.leandrit0.ktk.command.args.StopCommand;
import me.leandrit0.ktk.utils.command.ExecutableCommand;

public class KingCommand extends ExecutableCommand {
	
	public KingCommand(KillTheKing plugin) {
		super("king");
		this.addArgument(new SetCommand(plugin));
		this.addArgument(new StopCommand(plugin));
	}

}
