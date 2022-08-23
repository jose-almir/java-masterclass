package io.github.josealmir.designpatterns.creation.singleton;

/*
 Singleton is a creational design pattern that
 restricts the instantiation of a class to one object.
 The singleton pattern ensure that a class has only one instance, and provide a global point of access to it.
 Singleton violates the SRP (solves two problems at the same time)
 Difficult to test, difficult to maintain, difficult to extend, difficult to reuse.
 */
public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton functionality");
    }
}

