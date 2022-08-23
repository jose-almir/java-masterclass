package io.github.josealmir.designpatterns.creation.factorymethod;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
