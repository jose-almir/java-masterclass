package io.github.josealmir.designpatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        ConcreteOriginator originator = new ConcreteOriginator();
        Caretaker<String> caretaker = new Caretaker<>(originator);
        originator.setState("State 1");
        caretaker.makeSnapshot();
        originator.setState("State 2");
        caretaker.undo();
        System.out.println(originator.getState());
    }
}
