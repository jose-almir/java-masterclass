package io.github.josealmir.designpatterns.behavioral.command;

public class UppercaseTextCommand implements Command {
    private String text;

    public UppercaseTextCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(text.toUpperCase());
    }
}
