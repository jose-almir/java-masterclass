package io.github.josealmir.designpatterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
