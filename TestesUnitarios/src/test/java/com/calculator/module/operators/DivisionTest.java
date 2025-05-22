package com.calculator.module.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

import static org.junit.jupiter.api.Assertions.*;
class DivisionTest {

    Division division = new Division();

    @Test
    void calculate() {
        //arrange
        int valueA = 10;
        int valueB = 2;

        //Act
        int result = division.calculate(valueA, valueB);

        //assert
        assertEquals(5,result);
    }
}