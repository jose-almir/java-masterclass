package io.github.josealmir.designpatterns.structural.decorator;

public class DatasourceDecorator implements Datasource{
    protected Datasource wrappee;

    public DatasourceDecorator(Datasource wrappee) {
        this.wrappee = wrappee;
    }


    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
