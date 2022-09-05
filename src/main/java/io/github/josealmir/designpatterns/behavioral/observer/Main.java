package io.github.josealmir.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        ConcretePublisher<String> pub = new ConcretePublisher<>();
        pub.subscribe((publisher)-> {
            System.out.println("Subscriber 1: " + publisher.getState());
        });

        pub.subscribe((publisher)-> {
            System.out.println("Subscriber 2: " + publisher.getState());
        });

        pub.setState("Hello World!");
    }
}
