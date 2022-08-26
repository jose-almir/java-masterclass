package io.github.josealmir.designpatterns.structural.decorator;

public interface Datasource {
    void writeData(String data);
    String readData();
}
