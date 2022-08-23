package io.github.josealmir.designpatterns.creation.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.doSomething();
        // SingletonExample instance = new SingletonExample();  /* this don't work */
        LazySingleton lazyInstance = LazySingleton.getInstance();
        lazyInstance.doSomething();
    }
}
