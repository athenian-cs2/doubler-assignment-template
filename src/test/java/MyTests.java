import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyTests {

    @Test
    public void testChineseGreeting() {
        MyClass chinese = new MyClass("Ni Hao!");

        // assert statements
        assertEquals("Ni Hao!", chinese.getGreeting());
        assertNotEquals("Hello!", chinese.getGreeting());
    }

    @Test
    public void testSpanishGreeting() {
        MyClass spanish = new MyClass("Hola!");

        // assert statements
        assertEquals("Hola!", spanish.getGreeting());
        assertNotEquals("Hello!", spanish.getGreeting());
    }
}
