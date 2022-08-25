package io.github.josealmir.designpatterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        return peg.getWidth() / 2;
    }
}
