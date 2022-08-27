package io.github.josealmir.designpatterns.structural.flyweight;

// Flyweight helps to saves some RAM by sharing repetitive state(immutable) between objects
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plant(1, 2, "Tree#1", "red", "simple");
        forest.draw("canva#1");
    }
}
