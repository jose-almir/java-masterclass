package io.github.josealmir.designpatterns.behavioral.state;

public class Draft implements State {

    private Document document;

    public Draft(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Render Draft");
    }

    @Override
    public void publish() {
        System.out.println("Publish Draft");
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
