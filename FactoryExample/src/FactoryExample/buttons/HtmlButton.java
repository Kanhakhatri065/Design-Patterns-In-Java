package FactoryExample.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test button</button>");
        this.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
