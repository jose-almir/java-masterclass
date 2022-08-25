package io.github.josealmir.designpatterns.structural.bridge;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.getDevice().setVolume(0);
    }
}
