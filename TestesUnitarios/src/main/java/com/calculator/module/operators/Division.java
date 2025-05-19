package com.calculator.module.operators;

public class Division {
    /**
     * Realiza a divisão de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    public double calculate(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
