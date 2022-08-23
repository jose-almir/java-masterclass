package io.github.josealmir.designpatterns.creation.prototype;

import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends ShapePrototype implements ShapeBase {

    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public double getArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public ShapePrototype clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
