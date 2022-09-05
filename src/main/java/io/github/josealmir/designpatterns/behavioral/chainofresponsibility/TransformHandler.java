package io.github.josealmir.designpatterns.behavioral.chainofresponsibility;

public class TransformHandler extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Transform")) { // condition that allows the handler to process the request
            System.out.println("Transforming...");
        } else {
            super.handleRequest(request); // pass the request to the next handler in the chain
        }
    }
}
