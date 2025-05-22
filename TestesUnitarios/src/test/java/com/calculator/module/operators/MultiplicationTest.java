package com.calculator.module.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    Multiplication multi = new Multiplication();

    @Test
    void calculate() {
        //arrange
        int valueA = 10;
        int valueB = 20;

        //Act
        int result = multi.calculate(valueA, valueB);

        //assert
        assertEquals(200,result);
    }
}