package io.github.josealmir.designpatterns.structural.adapter;

// Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
// The adapter makes the interface of one class compatible with another.
// The adapter lets classes work together that previously could not because of incompatible interfaces.

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(4);
        System.out.println(roundHole.fits(roundPeg));
        SquarePeg smallSquarePeg = new SquarePeg(6);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
