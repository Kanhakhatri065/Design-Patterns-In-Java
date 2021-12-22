package FactoryExample.factory;

import FactoryExample.buttons.Button;
import FactoryExample.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
