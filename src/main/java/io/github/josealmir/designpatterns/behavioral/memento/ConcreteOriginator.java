package io.github.josealmir.designpatterns.behavioral.memento;

public class ConcreteOriginator implements Originator<String>{

    private String state;
    @Override
    public Memento<String> saveState() {
        return new Memento<>(state, this);
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
