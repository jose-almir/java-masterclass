package io.github.josealmir.designpatterns.behavioral.templatemethod;

public class OrcsAI extends GameAI {
    @Override
    public void buildStructures() {
        System.out.println("Building Orc structures");
    }

    @Override
    public void buildUnits() {
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Orcs");
    }
}
