package io.github.josealmir.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker<T> {
    private final Originator<T> originator;
    private final List<Memento<T>> mementos;

    public Caretaker(Originator<T> originator){
        this.originator = originator;
        this.mementos = new ArrayList<>();
    }

    public void makeSnapshot() {
        mementos.add(originator.saveState());
    }

    public void undo() {
        if(mementos.size() > 0) {
            mementos.remove(mementos.size() - 1).restore();
        }
    }

}
