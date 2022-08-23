package io.github.josealmir.designpatterns.creation.prototype;

/*
    Prototype pattern is used when you want to create a new object by copying an existing one.
 */

import java.util.Objects;

public abstract class ShapePrototype {
    public int x;
    public int y;
    public String color;

    public ShapePrototype() {
    }

    public ShapePrototype(ShapePrototype target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract ShapePrototype clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapePrototype shapePrototype = (ShapePrototype) o;
        return x == shapePrototype.x && y == shapePrototype.y && color.equals(shapePrototype.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
