import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testDoubler() {
        Doubler doubler = new Doubler();

        // assert statements
        assertEquals(16, doubler.doubleIt(8));
        assertEquals(24, doubler.doubleIt(12));
        assertEquals(0, doubler.doubleIt(0));
        assertEquals(-2, doubler.doubleIt(-1));
    }

}
