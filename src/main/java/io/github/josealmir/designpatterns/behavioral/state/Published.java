package io.github.josealmir.designpatterns.behavioral.state;

public class Published implements State {

    private Document document;

    public Published(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Render Published");
    }

    @Override
    public void publish() {
        System.out.println("Publish Published");
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
