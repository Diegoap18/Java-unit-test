package com.calculator.module.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();


    @Test
    void calculate() {
        //arrange
        int valueA = 10;
        int valueB = 20;

        //Act
        int result = addition.calculate(valueA, valueB);

        //assert
        assertEquals(30,result);

    }
}