package io.github.josealmir.designpatterns.behavioral.command;

import java.util.Arrays;
import java.util.List;

public class JoinTextCommand implements Command {
    private String separator;
    private List<String> words;

    public JoinTextCommand(String separator, List<String> words) {
        this.separator = separator;
        this.words = words;
    }

    @Override
    public void execute() {
        System.out.println(String.join(separator, words));
    }
}
