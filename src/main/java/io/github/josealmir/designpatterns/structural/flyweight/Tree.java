package io.github.josealmir.designpatterns.structural.flyweight;

public class Tree {
    private double x;
    private double y;
    private TreeType type;

    public Tree(double x, double y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas) {
        type.draw(canvas, x, y);
    }
}
