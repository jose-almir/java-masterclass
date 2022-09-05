package io.github.josealmir.designpatterns.behavioral.templatemethod;

// Template Method is a behavioral design pattern that defines
// the skeleton of an algorithm in the superclass but lets subclasses
// override specific steps of the algorithm without changing its structure.
public class Main {
    public static void main(String[] args) {
        GameAI gameAI = new MonstersAI();
        gameAI.takeTurn();
    }
}
