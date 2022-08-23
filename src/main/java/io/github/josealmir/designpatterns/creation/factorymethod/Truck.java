package io.github.josealmir.designpatterns.creation.factorymethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
