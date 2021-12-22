package AdapterInterface.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        if(this.getRadius() >= peg.getRadius()) {
            return true;
        }

        return false;
    }
}
