package io.github.josealmir.designpatterns.creation.abstractfactory;

public class MaterialUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MaterialCheckbox();
    }
}
