package io.github.josealmir.designpatterns.behavioral.templatemethod;

public class MonstersAI extends GameAI {
    @Override
    public void buildStructures() {
    }

    @Override
    public void buildUnits() {
        System.out.println("Building Monsters units");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Monsters");
    }
}
