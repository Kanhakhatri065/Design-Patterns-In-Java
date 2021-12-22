package ProtoTypeExample.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Shape)) return false;
        Shape otherShape = (Shape) other;
        return this.x == otherShape.x &&
                this.y == otherShape.y &&
                Objects.equals(this.color, otherShape.color);
    }
}
