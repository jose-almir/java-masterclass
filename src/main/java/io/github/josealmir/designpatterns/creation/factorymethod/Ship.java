package io.github.josealmir.designpatterns.creation.factorymethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
