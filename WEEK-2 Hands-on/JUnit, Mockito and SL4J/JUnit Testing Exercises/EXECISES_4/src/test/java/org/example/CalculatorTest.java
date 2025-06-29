package org.example;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    // Setup (runs before each test)
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator object");
        calculator = new Calculator();
    }

    // Teardown (runs after each test)
    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator object");
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        int a = 4;
        int b = 2;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(8, result);
    }
}

