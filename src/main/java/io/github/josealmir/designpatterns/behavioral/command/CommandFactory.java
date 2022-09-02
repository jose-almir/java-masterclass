package io.github.josealmir.designpatterns.behavioral.command;

public interface CommandFactory {
    Command create(String[] args);
}
