package io.github.josealmir.designpatterns.structural.bridge;

// Bridge is a design pattern that lets you split a large class or a set of closely related classes into two separate
// hirarchies—abstraction and implementation—which can be developed independently of each other.

public class Main {
    public static void main(String[] args) {
        AdvancedRemote remote = new AdvancedRemote(new Radio());
        remote.togglePower();
        remote.channelUp();
        remote.channelDown();
        remote.togglePower();
        remote.mute();
    }
}
