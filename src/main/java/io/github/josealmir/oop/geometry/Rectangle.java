package io.github.josealmir.oop.geometry;

import static java.lang.Math.abs;

public class Rectangle {
    final Point2D topLeft;
    final Point2D bottomRight;
    final Double area;
    final Double perimeter;

    final Double width;

    final Double height;

    public Rectangle(Point2D topLeft, Point2D bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.width = abs(topLeft.getX() - bottomRight.getX());
        this.height = abs(topLeft.getY() - bottomRight.getY());
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }
}
