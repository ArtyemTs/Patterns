import adapter.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)){
            System.out.println("round peg r5 fits round hole r5.");
        }

        SquarePeg smollPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(200);

        SquarePegAdapter smollSqPegAd = new SquarePegAdapter(smollPeg);
        SquarePegAdapter largeSqPegAd = new SquarePegAdapter(largePeg);

        if (hole.fits(smollSqPegAd)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (hole.fits(largeSqPegAd)) {
            System.out.println("Square peg w200 fits round hole r5.");
        }

    }
}
