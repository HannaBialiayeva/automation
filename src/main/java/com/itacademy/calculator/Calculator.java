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
            case "":
                try {
                    throw new WrongDataGettingException("Incorrect data was entered." +
                            "Please,restart program!");
                } catch (WrongDataGettingException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator! Please, restart the program");
                break;
        }
        return resultOfOperation;
    }


}
