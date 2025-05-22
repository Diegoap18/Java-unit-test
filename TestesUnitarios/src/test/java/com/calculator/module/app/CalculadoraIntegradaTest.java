package com.calculator.module.app;

import com.calculator.module.operators.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIntegradaTest {

    Subtraction sub = new Subtraction();
    RestDivision restdivi = new RestDivision();
    Multiplication multi = new Multiplication();
    Division division = new Division();
    Addition addition = new Addition();

    int valueA = 10;
    int valueB = 20;

    @Test
    void addition() {
        int result = addition.calculate(valueA, valueB);
        assertEquals(30,result);
    }

    @Test
    void subtraction() {
        int result = sub.calculate(valueA, valueB);
        assertEquals(-10,result);
    }

    @Test
    void multiplication() {
        int result = multi.calculate(valueA, valueB);
        assertEquals(200,result);
    }

    @Test
    void division() {
        int result = division.calculate(valueA, valueB);
        assertEquals(0,result);
    }

    @Test
    void restDivision() {
        int result = restdivi.calculate(valueA, valueB);
        assertEquals(10,result);
    }
}