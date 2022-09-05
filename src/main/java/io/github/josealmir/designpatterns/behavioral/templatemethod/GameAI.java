package io.github.josealmir.designpatterns.behavioral.templatemethod;

public class GameAI {
    public void takeTurn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public void collectResources() {
        System.out.println("Collecting resources");
    }

    public void buildStructures() {
        System.out.println("Building structures");
    }

    public void buildUnits() {
        System.out.println("Building units");
    }

    public void attack() {
        System.out.println("Attacking");
    }

    public void sendScouts(int posX, int posY) {
        System.out.println("Sending scouts to " + posX + ", " + posY);
    }

    public void sendWarriors(int posX, int posY) {
        System.out.println("Sending warriors to " + posX + ", " + posY);
    }
}
