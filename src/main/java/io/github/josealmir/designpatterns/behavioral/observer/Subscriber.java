package io.github.josealmir.designpatterns.behavioral.observer;

public interface Subscriber<T> {
    void update(Publisher<T> data);
}
