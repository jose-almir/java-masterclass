package io.github.josealmir.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> children;

    public CompoundGraphic() {
        this.children = new ArrayList<>();
    }

    public void add(Graphic child) {
        this.children.add(child);
    }

    public void remove(Graphic child) {
        this.children.remove(child);
    }

    @Override
    public void move(double x, double y) {
        for (Graphic child : this.children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for(Graphic child : this.children) {
            child.draw();
        }
    }
}
