package FactoryExample.factory;

import FactoryExample.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = this.createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
