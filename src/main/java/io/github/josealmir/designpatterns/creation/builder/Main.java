package io.github.josealmir.designpatterns.creation.builder;

// Builder Pattern is used to create complex objects with constituent parts that can be created in different ways.

public class Main {
    public static void main(String[] args) {
        House house = HouseBuilder.newInstance()
                .withDoors(2)
                .withWindows(1)
                .withRooms(3)
                .withBaths(1)
                .withFloors(1)
                .withPrice(1000000)
                .build();
        System.out.println(house);
    }
}
