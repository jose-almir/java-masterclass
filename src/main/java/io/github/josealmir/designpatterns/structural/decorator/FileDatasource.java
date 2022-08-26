package io.github.josealmir.designpatterns.structural.decorator;

public class FileDatasource implements Datasource {
    private String filename;
    private String data = "";

    public FileDatasource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return this.data;
    }
}
