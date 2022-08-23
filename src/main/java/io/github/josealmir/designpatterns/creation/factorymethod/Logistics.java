package io.github.josealmir.designpatterns.creation.factorymethod;

// Creator (Logistics)
public abstract class Logistics {
    public abstract Transport createTransport(); // factory method pattern - declares an interface for creating an object, but let subclasses decide which class to instantiate.

    public void planDelivery() {
        Transport t = createTransport();
    }
}
