package io.github.josealmir.designpatterns.behavioral.chainofresponsibility;

public class OtherHandler extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Other")) {
            System.out.println("Other...");
        } else {
            super.handleRequest(request);
        }
    }
}
