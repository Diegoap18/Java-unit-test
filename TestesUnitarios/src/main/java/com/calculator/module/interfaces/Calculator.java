package com.calculator.module.interfaces;

public interface Calculator {
    /**
     * Realiza a adição de dois números
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da adição
     */
    int addition(int a, int b);

    /**
     * Realiza a subtração de dois números
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da subtração
     */
    int subtraction(int a, int b);

    /**
     * Realiza a multiplicação de dois números
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da multiplicação
     */
    int multiplication(int a, int b);

    /**
     * Realiza a divisão de dois números
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    int division(int a, int b) throws ArithmeticException;

    /**
     * Realiza a divisão com resto de dois números
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resto da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    int restDivision(int a, int b) throws ArithmeticException;
}