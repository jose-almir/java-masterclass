package io.github.josealmir.poo.petshop;

public class Main {
    public static void main(String[] args) {
        PetshopSystem system = new PetshopSystem();
        system.addPet(
                new Dog("Fido", 2, 10.0, new Food[]{new Food("Bone", 2), new Food("Meat", 3)})
        );

        system.addPet(
                new Cat("Garfield", 5, 5.0, new Food[]{new Food("Fish", 1), new Food("Chips", 1)})
        );

        system.feedAll(new Food("Fish", 1));
    }
}
