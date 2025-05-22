package com.calculator.module.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestDivisionTest {

    RestDivision restdivi = new RestDivision();

    @Test
    void calculate() {
        //arrange
        int valueA = 10;
        int valueB = 20;

        //Act
        int result = restdivi.calculate(valueA, valueB);

        //assert
        assertEquals(10, result);
    }
}