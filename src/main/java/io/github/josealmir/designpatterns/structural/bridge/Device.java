package io.github.josealmir.designpatterns.structural.bridge;

// The "implementation" interface declares methods common to all
// concrete implementation classes. It doesn't have to match the
// abstraction's interface. In fact, the two interfaces can be
// entirely different. Typically, the implementation interface
// provides only primitive operations, while the abstraction
// defines higher-level operations based on those primitives.

public interface Device {
    void enable();

    void disable();

    boolean isEnabled();

    double getVolume();

    void setVolume(double percent);

    void setChannel(int channel);

    int getChannel();
}
