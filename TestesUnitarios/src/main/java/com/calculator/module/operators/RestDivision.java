package com.calculator.module.operators;

public class RestDivision {
    /**
     * Realiza a operação de resto da divisão de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resto da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    public int calculate(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a % b;
    }
}
