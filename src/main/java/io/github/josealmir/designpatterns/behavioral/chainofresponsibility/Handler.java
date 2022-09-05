package io.github.josealmir.designpatterns.behavioral.chainofresponsibility;

public interface Handler {
    public void setNextHandler(Handler handler);
    public void handleRequest(String request);
}
