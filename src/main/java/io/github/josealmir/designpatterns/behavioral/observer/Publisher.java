package io.github.josealmir.designpatterns.behavioral.observer;

public interface Publisher<T> {
    void subscribe(Subscriber<T> subscriber);

    void unsubscribe(Subscriber<T> subscriber);

    void notifySubscribers();

    T getState();
}
