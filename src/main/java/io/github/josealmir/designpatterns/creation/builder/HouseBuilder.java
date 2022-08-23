package io.github.josealmir.designpatterns.creation.builder;

public class HouseBuilder {
    private final House result;

    public static HouseBuilder newInstance() {
        return new HouseBuilder();
    }

    private HouseBuilder() {
        result = new House();
    }

    public HouseBuilder withDoors(Integer doors) {
        result.setDoors(doors);
        return this;
    }

    public HouseBuilder withWindows(Integer windows) {
        result.setWindows(windows);
        return this;
    }

    public HouseBuilder withRooms(Integer rooms) {
        result.setRooms(rooms);
        return this;
    }

    public HouseBuilder withBaths(Integer baths) {
        result.setBaths(baths);
        return this;
    }

    public HouseBuilder withGarages(Integer garages) {
        result.setGarages(garages);
        return this;
    }

    public HouseBuilder withFloors(Integer floors) {
        result.setFloors(floors);
        return this;
    }

    public HouseBuilder withPrice(Integer price) {
        result.setPrice(price);
        return this;
    }

    public House build() {
        return result;
    }
}
