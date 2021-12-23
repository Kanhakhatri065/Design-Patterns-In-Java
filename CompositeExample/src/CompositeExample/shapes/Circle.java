package CompositeExample.shapes;

import java.awt.*;

public class Circle extends BaseShape {
    public int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return this.radius * 2;
    }

    @Override
    public int getHeight() {
        return this.radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, this.getWidth() - 1, this.getHeight() - 1);
    }
}
