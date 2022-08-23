package io.github.josealmir.designpatterns.creation.factorymethod;

// factory method pattern - potentially usable in spring boot.

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new SeaLogistics();
        Transport transport = logistics.createTransport();
        transport.deliver();
    }
}
