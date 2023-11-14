package com.github.repomeisteractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void isFizzNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertFalse(fizzBuzz.isFizzNumber(1));
        assertFalse(fizzBuzz.isFizzNumber(2));
        assertTrue(fizzBuzz.isFizzNumber(3));
        assertFalse(fizzBuzz.isFizzNumber(4));
        assertFalse(fizzBuzz.isFizzNumber(5));
        assertTrue(fizzBuzz.isFizzNumber(15));
    }

    @Test
    public void isBuzzNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertFalse(fizzBuzz.isBuzzNumber(1));
        assertFalse(fizzBuzz.isBuzzNumber(2));
        assertFalse(fizzBuzz.isBuzzNumber(3));
        assertFalse(fizzBuzz.isBuzzNumber(4));
        assertTrue(fizzBuzz.isBuzzNumber(5));
        assertTrue(fizzBuzz.isBuzzNumber(15));
    }

    @Test
    public void generate() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "";
        expected += "1\n";
        expected += "2\n";
        expected += "Fizz\n";
        expected += "4\n";
        expected += "Buzz\n";
        expected += "Fizz\n";
        expected += "7\n";
        expected += "8\n";
        expected += "Fizz\n";
        expected += "Buzz\n";
        expected += "11\n";
        expected += "Fizz\n";
        expected += "13\n";
        expected += "14\n";
        expected += "FizzBuzz\n";

        String result = fizzBuzz.generate(15);

        assertEquals(expected, result);
    }
}
