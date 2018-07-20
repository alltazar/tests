import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class Tests {

    @Test
    public void checkSum() {
        Main.Complex c1 = new Main.Complex(23, 62);
        Main.Complex c2 = new Main.Complex(11, 24);

        assertEquals(new Main.Complex(34, 86), Main.Complex.sum(c1, c2));

        c1 = new Main.Complex(44, 12);
        c2 = new Main.Complex(61, 20);

        assertEquals(new Main.Complex(105, 32), Main.Complex.sum(c1, c2));

        c1 = new Main.Complex(33, 62);
        c2 = new Main.Complex(55, 24);

        assertEquals(new Main.Complex(88, 86), Main.Complex.sum(c1, c2));

        c1 = new Main.Complex(0, 0);
        c2 = new Main.Complex(55, 24);

        assertEquals(new Main.Complex(55, 24), Main.Complex.sum(c1, c2));

        c1 = new Main.Complex(-33, 0);
        c2 = new Main.Complex(0, -24);

        assertEquals(new Main.Complex(-33, -24), Main.Complex.sum(c1, c2));
    }

    @Test(expected = NullPointerException.class)
    public void checkSumThrowsNPE() {
        Main.Complex c1 = null;
        Main.Complex c2 = new Main.Complex(0, -24);

        Main.Complex.sum(c1, c2);
    }

    @Test
    public void checkMinus() {
        Main.Complex c1 = new Main.Complex(23, 62);
        Main.Complex c2 = new Main.Complex(11, 24);

        assertEquals(new Main.Complex(12, 38), Main.Complex.minus(c1, c2));

        c1 = new Main.Complex(54, 72);
        c2 = new Main.Complex(110, 242);

        assertEquals(new Main.Complex(-56, -170), Main.Complex.minus(c1, c2));

        c1 = new Main.Complex(223, 692);
        c2 = new Main.Complex(5, 824);

        assertEquals(new Main.Complex(218, -132), Main.Complex.minus(c1, c2));

        c1 = null;
        c2 = new Main.Complex(5, 824);

        assertNull(Main.Complex.minus(c1, c2));
    }

    @Test
    public void checkMult() {
        Main.Complex c1 = new Main.Complex(1, -5);
        Main.Complex c2 = new Main.Complex(5, 2);

        assertEquals(new Main.Complex(15, -23), Main.Complex.mult(c1, c2));
    }
}