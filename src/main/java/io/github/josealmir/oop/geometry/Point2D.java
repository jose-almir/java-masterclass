package io.github.josealmir.oop.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point2D {
    private final Double x;
    private final Double y;

    public Point2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = .0;
        this.y = .0;
    }

    public Double distanceFrom(Point2D point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2));
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
