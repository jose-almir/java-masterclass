package io.github.josealmir.designpatterns.behavioral.state;

public class Document {
    private State state;

    public Document() {
        this.state = new Draft(this);
    }

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish();
    }

    public void setState(State state) {
        this.state = state;
    }
}
