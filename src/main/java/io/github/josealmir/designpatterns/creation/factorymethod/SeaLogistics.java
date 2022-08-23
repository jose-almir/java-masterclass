package io.github.josealmir.designpatterns.creation.factorymethod;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
