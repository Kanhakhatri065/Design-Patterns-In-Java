package AdapterInterface;

import AdapterInterface.adapters.SquarePegAdapter;
import AdapterInterface.round.RoundHole;
import AdapterInterface.round.RoundPeg;
import AdapterInterface.square.SquarePeg;

public class Main {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);

        if(hole.fits(peg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if(hole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!hole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
