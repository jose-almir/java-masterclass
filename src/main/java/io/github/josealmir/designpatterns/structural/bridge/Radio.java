package io.github.josealmir.designpatterns.structural.bridge;

public class Radio implements Device {
    private boolean isEnabled;
    private double volume;

    private int channel;

    @Override
    public void enable() {
        this.isEnabled = true;
    }

    @Override
    public void disable() {
        this.isEnabled = false;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(double percent) {
        this.volume = percent;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }
}
