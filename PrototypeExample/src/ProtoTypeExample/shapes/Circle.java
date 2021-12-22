package ProtoTypeExample.shapes;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof  Circle) || !super.equals(other)) return false;
        Circle otherShape = (Circle) other;
        return this.radius == otherShape.radius;
    }
}
