package com.calculator.module.app;

import com.calculator.module.interfaces.Calculator;
import com.calculator.module.operators.*;


public class CalculadoraIntegrada implements Calculator {


    private Addition sum;
    private Subtraction sub;
    private Multiplication mult;
    private Division div;
    private RestDivision restDiv;

    @Override
    public int addition(int a, int b) {
        return sum.calculate(a,b);
    }

    @Override
    public int subtraction(int a, int b) {
        return sub.calculate(a,b);

    }

    @Override
    public int multiplication(int a, int b) {
        return mult.calculate(a,b);

    }

    @Override
    public int division(int a, int b) throws ArithmeticException {
        return div.calculate(a,b);
    }

    @Override
    public int restDivision(int a, int b) throws ArithmeticException {
        return restDiv.calculate(a,b);

    }
}
