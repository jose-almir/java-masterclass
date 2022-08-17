package io.github.josealmir.poo.petshop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    private final List<Food> favoriteFoods;
    private String name;
    private Integer age;
    private Double weight;


    Pet(String name, int age, double weight, Food[] favoriteFoods) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favoriteFoods = new ArrayList<>();
        this.favoriteFoods.addAll(List.of(favoriteFoods));
    }

    public abstract void makeSound();

    public void eat(Food food) {
        if (favoriteFoods.contains(food)) {
            System.out.print("Yummy! ");
            this.makeSound();
        } else {
            System.out.println("Not my favorite food.");
        }
    }

    public void walk() {
        System.out.println("Walking...");
        this.makeSound();
    }

    public void sleep() {
        System.out.println("Sleeping...");
        this.makeSound();
    }

    public void play() {
        System.out.println("Playing...");
        this.makeSound();
    }

    public void drink() {
        System.out.println("Drinking...");
        this.makeSound();
    }

    public void wash() {
        System.out.println("Washing...");
        this.makeSound();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
