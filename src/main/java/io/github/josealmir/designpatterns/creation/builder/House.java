package io.github.josealmir.designpatterns.creation.builder;

public class House {
    private Integer doors;
    private Integer windows;
    private Integer rooms;
    private Integer baths;
    private Integer garages;
    private Integer floors;
    private Integer price;

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getWindows() {
        return windows;
    }

    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getGarages() {
        return garages;
    }

    public void setGarages(Integer garages) {
        this.garages = garages;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
