package com.company;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaylorSinTest {
    @Test
    void zeroTest() {
        double val = 0;
        double approx = Math.pow(10, -10);
        double result = Main.TaylorSin.countTaylor(val, approx);
        double expected = Math.sin(val);
        assertTrue(Math.abs(result - expected) < approx);
    }

    @Test
    void noApproximationTest() {
        double val = Math.PI / 4;
        double approx = 1;
        double result = Main.TaylorSin.countTaylor(val, approx);
        double expected = Math.sin(val);
        assertTrue(Math.abs(result - expected) < approx);
    }

    @Test
    void randomValue() {
        double val = Math.random() * 2 * Math.PI;
        double approx = Math.pow(10, -10);
        double result = Main.TaylorSin.countTaylor(val, approx);
        double expected = Math.sin(val);
        assertTrue(Math.abs(result - expected) < approx);
    }

}