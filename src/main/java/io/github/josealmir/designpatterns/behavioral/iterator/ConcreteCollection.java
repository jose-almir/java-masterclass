package io.github.josealmir.designpatterns.behavioral.iterator;

public class ConcreteCollection implements IterableCollection<String> {
    private final String[] names = {"Jose", "Maria", "Joao", "Pedro", "Ana", "Paulo", "Julia", "Marcos", "Juliana", "Mariana"};

    @Override
    public Iterator<String> createIterator() {
        return new ConcreteIterator(names);
    }
}
