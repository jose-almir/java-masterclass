package io.github.josealmir.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcretePublisher<T> implements Publisher<T>{
    private final List<Subscriber<T>> subscribers;
    private T state;

    public ConcretePublisher() {
        this.subscribers = new ArrayList<>();
    }


    @Override
    public void subscribe(Subscriber<T> subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber<T> subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(this));
    }

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
        notifySubscribers();
    }
}
