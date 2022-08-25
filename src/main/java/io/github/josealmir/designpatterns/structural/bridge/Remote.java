package io.github.josealmir.designpatterns.structural.bridge;

public class Remote {
    private final Device device; // for specific device

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    public void channelUp() {
        this.device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        this.device.setChannel(device.getChannel() - 1);
    }

    public Device getDevice() {
        return this.device;
    }
}
