package io.github.josealmir.designpatterns.structural.decorator;

public class CompressionDecorator extends DatasourceDecorator {
    public CompressionDecorator(Datasource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        wrappee.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = wrappee.readData();
        return decompress(compressedData);
    }

    private String compress(String data) {
        return data.toUpperCase();
    }

    private String decompress(String data) {
        return data.toLowerCase();
    }
}
