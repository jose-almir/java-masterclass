package io.github.josealmir.designpatterns.behavioral.iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
