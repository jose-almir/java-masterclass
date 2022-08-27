package io.github.josealmir.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public void plant(double x, double y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw(String canvas) {
        for(Tree tree : this.trees) {
            tree.draw(canvas);
        }
    }
}
