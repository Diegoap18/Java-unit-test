package com.calculator.module.interfaces;

public interface Calculator {
    /**
     * Realiza a adição de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da adição
     */
    double addition(double a, double b);

    /**
     * Realiza a subtração de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da subtração
     */
    double subtraction(double a, double b);

    /**
     * Realiza a multiplicação de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da multiplicação
     */
    double multiplication(double a, double b);

    /**
     * Realiza a divisão de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    double division(double a, double b) throws ArithmeticException;

    /**
     * Realiza a divisão com resto de dois números
     * @param a primeiro operando
     * @param b segundo operando
     * @return resto da divisão
     * @throws ArithmeticException quando o divisor for zero
     */
    double restDivision(double a, double b) throws ArithmeticException;
}