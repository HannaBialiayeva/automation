package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;

public class CalculatorUtilMethods {

    public static double addNumbers(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    public static double divideNumbers(double number1, double number2) throws WrongDataGettingException {
        if (number2 == 0) {
            throw new WrongDataGettingException("Exception thrown: Incorrect data was entered.It's not possible to divide by 0. Please,restart program!");
        }
        double result = number1 / number2;
        return result;
    }

    public static double subtractNumbers(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public static double multiplyNumbers(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

}
