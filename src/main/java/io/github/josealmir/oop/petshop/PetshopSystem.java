package io.github.josealmir.oop.petshop;

import java.util.ArrayList;
import java.util.List;

public class PetshopSystem {
    private final List<Pet> pets;

    public PetshopSystem() {
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void feedAll(Food food) {
        for (Pet pet : pets) {
            pet.eat(food);
        }
    }

    public List<Pet> getPets() {
        return pets;
    }
}
