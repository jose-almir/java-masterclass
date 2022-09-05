package io.github.josealmir.designpatterns.behavioral.chainofresponsibility;


// Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
// Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new TransformHandler();
        Handler handler2 = new OtherHandler();
        Handler handler3 = new TransformHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleRequest("Other");
    }
}
