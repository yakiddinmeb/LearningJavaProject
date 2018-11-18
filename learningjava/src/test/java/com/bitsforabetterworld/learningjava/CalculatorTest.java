package com.bitsforabetterworld.learningjava;

import static org.junit.Assert.*;
import org.junit.Test;


// TODO for students: Implement this class so it passes the tests below.
class Calculator {

    public void add(int n) {

    }

    public void subtract(int n) {

    }

    public void multiply(int n) {

    }

    public int getValue() {
        return 0;
    }
}

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldStartWithZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.getValue());
    }

    @Test
    public void addANumber() {
        Calculator calc = new Calculator();
        calc.add(1);
        assertEquals(1, calc.getValue());
    }

    @Test
    public void addTwoNumbers() {
        Calculator calc = new Calculator();
        calc.add(42);
        calc.add(99);
        assertEquals(141, calc.getValue());
    }

    @Test
    public void subtractANumber() {
        Calculator calc = new Calculator();
        calc.subtract(7);
        assertEquals(-7, calc.getValue());
    }

    @Test
    public void subtractTwoNumbers() {
        Calculator calc = new Calculator();
        calc.subtract(100);
        calc.subtract(1000);
        assertEquals(-1100, calc.getValue());
    }

    @Test
    public void multiplyANumber() {
        Calculator calc = new Calculator();
        calc.multiply(999);
        assertEquals(0, calc.getValue()); // Because anything times zero is zero
    }

    @Test
    public void addAndMultiply() {
        Calculator calc = new Calculator();
        calc.add(6);
        calc.multiply(7);
        assertEquals(42, calc.getValue());
    }

}
