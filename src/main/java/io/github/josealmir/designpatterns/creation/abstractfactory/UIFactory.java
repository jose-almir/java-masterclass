package io.github.josealmir.designpatterns.creation.abstractfactory;

// Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

public interface UIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
