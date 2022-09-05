package io.github.josealmir.designpatterns.behavioral.chainofresponsibility;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
