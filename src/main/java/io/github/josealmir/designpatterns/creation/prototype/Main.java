package io.github.josealmir.designpatterns.creation.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 2;
        circle.color = "red";
        circle.radius = 3;
        Circle circle2 = (Circle) circle.clone();

        System.out.println(circle.equals(circle2)); // different references, same values
    }
}
