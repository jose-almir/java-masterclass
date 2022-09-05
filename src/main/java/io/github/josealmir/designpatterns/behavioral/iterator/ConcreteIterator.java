package io.github.josealmir.designpatterns.behavioral.iterator;


public class ConcreteIterator implements Iterator<String> {
    private final String[] names;
    private int index;

    public ConcreteIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return names[index++];
        }

        throw new RuntimeException("No more elements");
    }
}
