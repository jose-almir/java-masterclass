package io.github.josealmir.designpatterns.structural.composite;

// Composite is a structural design pattern that lets you compose
// objects into tree structures and then work with these structures
// as if they were individual objects.

// The core model of your app must be represented by a tree

public class Main {
    public static void main(String[] args) {
        CompoundGraphic all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(2, 3, 5));
        CompoundGraphic group = new CompoundGraphic();
        group.add(new Dot(4, 5));
        group.add(new Circle(1, 1, 20));

        all.add(group);
        all.draw();
    }
}
