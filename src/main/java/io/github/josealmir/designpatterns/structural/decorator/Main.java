package io.github.josealmir.designpatterns.structural.decorator;

// Decorator is a structural design pattern that lets you
// attach new behaviors to objects by placing these objects
// inside special wrapper objects.

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new FileDatasource("data.txt");
        //datasource = new CompressionDecorator(datasource);
        datasource = new EncryptionDecorator(datasource);
        datasource.writeData("Hello!");
        System.out.println(datasource.readData());
    }
}
