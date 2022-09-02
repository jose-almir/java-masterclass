package io.github.josealmir.designpatterns.behavioral.command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CLI {
    static final Map<String, CommandFactory> commands;
    static final CommandFactory error = (args) -> new ShowErrorCommand("Command " + args[0] + " not defined.");

    static {
        commands = new HashMap<>();
        commands.put("-u", args -> new UppercaseTextCommand(args[1]));
        commands.put("-j", args -> new JoinTextCommand(args[1], List.of(args).subList(2, args.length)));
    }

    public static void main(String[] args) {
        CommandFactory factory = commands.getOrDefault(args[0], error);
        Command cmd = factory.create(args);
        cmd.execute();
    }
}
