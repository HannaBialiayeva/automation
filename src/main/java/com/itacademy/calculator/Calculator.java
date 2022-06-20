package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;

import static com.itacademy.calculator.CalculatorUtilMethods.*;

public class Calculator {

    public static double calculateNumbers(double number1, double number2, String operation)  throws WrongDataGettingException {

        double resultOfOperation = 0;
        switch (operation) {
            case "+":
                resultOfOperation = addNumbers(number1, number2);
                System.out.println("Result of operation: " + resultOfOperation);
                break;
            case "*":
                resultOfOperation = multiplyNumbers(number1, number2);
                System.out.println("Result of operation: " + resultOfOperation);
                break;
            case "/":
                    resultOfOperation = divideNumbers(number1, number2);
                    System.out.println("Result of operation: " + resultOfOperation);

                break;
            case "-":
                resultOfOperation = subtractNumbers(number1, number2);
                System.out.println("Result of operation: " + resultOfOperation);
                break;
            default:
                throw new WrongDataGettingException("Exception thrown: Incorrect operation was entered." +
                    " Use available operators: +, -, *, / and restart the program!");

        }
        return resultOfOperation;
    }
}
