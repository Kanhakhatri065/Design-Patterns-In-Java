package ProtoTypeExample.shapes;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        if(target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return null;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Circle) || !super.equals(other)) return false;
        Rectangle otherShape = (Rectangle) other;
        return this.width == otherShape.width &&
                this.height == otherShape.height;
    }
}
