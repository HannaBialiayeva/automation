package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;

import java.util.Scanner;

public class CalculatorInputReader {

    private double number;
    private String operation;

    public double getNumber() throws WrongDataGettingException {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number (Use ',' as divider for decimals!)");
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
            } else {
                throw new WrongDataGettingException("Exception thrown: Incorrect data was entered. " +
                        "Only numbers are allowed! " +
                        "Please,restart program!");
            }
            return number;
    }

    public String getOperation() throws WrongDataGettingException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, select operation. Available options: +, -, *, /");
        if (sc.hasNextLine()) {
            operation = sc.nextLine();
        } else {
            throw new WrongDataGettingException("Exception thrown: Incorrect operation was entered." +
                    " Use available operators: +, -, *, / and restart the program!");
        }
        return operation;
    }
}
