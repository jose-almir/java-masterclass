package io.github.josealmir.poo.petshop;


public final class Dog extends Pet {

    Dog(String name, int age, double weight, Food[] favoriteFoods) {
        super(name, age, weight, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
