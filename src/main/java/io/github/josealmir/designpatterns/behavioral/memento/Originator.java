package io.github.josealmir.designpatterns.behavioral.memento;

public interface Originator<T> {
    Memento<T> saveState();
    void setState(T state);
}
