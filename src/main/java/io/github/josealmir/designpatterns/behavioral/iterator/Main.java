package io.github.josealmir.designpatterns.behavioral.iterator;

// Use the Iterator pattern when your collection has a complex data structure (like a tree)
// under the hood, but you want to hide its complexity
// from clients (either for convenience or security reasons).

public class Main {
    public static void main(String[] args) {
        IterableCollection<String> collection = new ConcreteCollection();
        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
