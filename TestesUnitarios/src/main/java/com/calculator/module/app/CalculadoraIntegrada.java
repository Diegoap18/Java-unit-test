package com.calculator.module.app;

import com.calculator.module.interfaces.Calculator;
import com.calculator.module.operators.*;

public class CalculadoraIntegrada implements Calculator {

    /**
     * Classe principal da calculadora que implementa a interface ICalculadora
     * Utiliza as classes de operações específicas para realizar os cálculos
     */

    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;
    private final RestDivision restDivision;

    /**
     * Construtor que inicializa todas as classes de operações
     */

    public CalculadoraIntegrada() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
        this.multiplication = new Multiplication();
        this.division = new Division();
        this.restDivision = new RestDivision();

    }

    /**
     * Construtor parametrizado para injeção de dependências e para facilitar os testes
     */

    public CalculadoraIntegrada(Addition addition, Subtraction subtraction,
                                Multiplication multiplication, Division division,
                                RestDivision restDivision) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
        this.restDivision = restDivision;
    }


    @Override
    public double addition(double a, double b) {
        return addition.calculate(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return subtraction.calculate(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return multiplication.calculate(a, b);
    }

    @Override
    public double division(double a, double b) throws ArithmeticException {
        return division.calculate(a, b);
    }

    @Override
    public double restDivision(double a, double b) throws ArithmeticException {
        return restDivision.calculate(a, b);
    }
}
