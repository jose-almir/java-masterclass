package io.github.josealmir.designpatterns.creation.demo;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new SquareFactory();
        List<Shape> shapes = shapeFactory.createShapes(5);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle.draw()");
        }
    }

    static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Square.draw()");
        }
    }

    static abstract class ShapeFactory {
        public abstract Shape createShape();

        public List<Shape> createShapes(int n) {
            List<Shape> shapes = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                shapes.add(createShape());
            }
            return shapes;
        }
    }

    static class CircleFactory extends ShapeFactory {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    }

    static class SquareFactory extends ShapeFactory {
        @Override
        public Shape createShape() {
            return new Square();
        }
    }

}

