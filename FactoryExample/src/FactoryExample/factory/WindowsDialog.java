package FactoryExample.factory;

import FactoryExample.buttons.Button;
import FactoryExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
