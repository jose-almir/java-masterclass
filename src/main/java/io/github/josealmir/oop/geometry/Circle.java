package io.github.josealmir.oop.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    final Point2D center;
    final Double radius;
    final Double area;
    final Double circumference;

    public Circle(Point2D center, Double radius) {
        this.center = center;
        this.radius = radius;
        this.area = PI * pow(radius, 2);
        this.circumference = 2 * PI * radius;
    }
}
