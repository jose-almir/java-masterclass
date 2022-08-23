package io.github.josealmir.designpatterns.creation.abstractfactory;

public class CupertinoUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new CupertinoButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CupertinoCheckbox();
    }
}
