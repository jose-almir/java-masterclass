package io.github.josealmir.designpatterns.behavioral.memento;

public class Memento<T> {
    private final T state;
    private final Originator<T> originator;

    public Memento(T state, Originator<T> originator) {
        this.state = state;
        this.originator = originator;
    }

    public T getState() {
        return state;
    }

    public void restore() {
        originator.setState(state);
    }
}
