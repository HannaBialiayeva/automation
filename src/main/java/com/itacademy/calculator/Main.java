package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;

import static com.itacademy.calculator.Calculator.calculateNumbers;

public class Main {

    public static void main(String[] args) throws WrongDataGettingException {

        CalculatorInputReader calculatorInputReader = new CalculatorInputReader();
        double number1 = calculatorInputReader.getNumber();
        double number2 = calculatorInputReader.getNumber();
        String operation = calculatorInputReader.getOperation();

        calculateNumbers(number1, number2, operation);

    }
}
