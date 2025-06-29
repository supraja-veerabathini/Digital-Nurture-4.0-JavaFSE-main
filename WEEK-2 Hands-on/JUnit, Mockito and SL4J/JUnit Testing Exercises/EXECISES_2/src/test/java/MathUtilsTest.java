package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils math = new MathUtils();
        int result = math.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        MathUtils math = new MathUtils();
        int result = math.subtract(10, 5);
        assertEquals(5, result);
    }
}

