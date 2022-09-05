package io.github.josealmir.designpatterns.behavioral.state;


// State is a behavioral design pattern that lets and object
// alter its behavior when its internal state changes. It appears
// as if the object changed its class.
public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.render();
        document.publish();
        document.setState(new Published(document));
        document.render();
        document.publish();
    }
}
