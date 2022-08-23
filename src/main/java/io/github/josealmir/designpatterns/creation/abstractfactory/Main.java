package io.github.josealmir.designpatterns.creation.abstractfactory;

// Use the Abstract Factory when your code needs to work with various families of related products.

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new MaterialUIFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
    }
}
