package io.github.josealmir.oop.petshop;

public final class Cat extends Pet {
    Cat(String name, int age, double weight, Food[] favoriteFoods) {
        super(name, age, weight, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
