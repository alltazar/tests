import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    Main.Complex c1 = new Main.Complex(23.7, 62.1);
    Main.Complex c2 = new Main.Complex(11.7, 24.1);
    Main.Complex c3 = new Main.Complex(0.0, 0.0);
    Main.Complex c4 = new Main.Complex(11.7, 24.61);
    Main.Complex c5 = new Main.Complex(11.7, 24.61);

    @Test
    void checkSum() {
        assertTrue(new Main.Complex(35.4, 86.2).equals(Main.Complex.sum(c1, c2)));
        assertEquals(new Main.Complex(35.4, 86.2), Main.Complex.sum(c1, c2));
        assertTrue(c4.equals(c5));
    }
}