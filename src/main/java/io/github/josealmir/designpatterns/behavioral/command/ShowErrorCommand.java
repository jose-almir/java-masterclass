package io.github.josealmir.designpatterns.behavioral.command;

public class ShowErrorCommand implements Command {
    private String message;

    public ShowErrorCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(Colorizer.ANSI_RED + message + Colorizer.ANSI_RESET);
    }
}
