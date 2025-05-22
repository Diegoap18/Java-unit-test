package com.calculator.module.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    Subtraction sub = new Subtraction();

    @Test
    void calculate() {
        //arrange
        int valueA = 20;
        int valueB = 5;

        //Act
        int result = sub.calculate(valueA, valueB);

        //assert
        assertEquals(15, result);
    }
}