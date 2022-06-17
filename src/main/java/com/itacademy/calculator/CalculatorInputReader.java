package com.itacademy.calculator;

import java.util.Scanner;

public class CalculatorInputReader {

    private double number;
    private String operation;

    public double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (Use ',' as divider for decimals!)");
        if (sc.hasNextDouble()) {
            number = sc.nextDouble();
        } else {
            System.out.println("Only numbers are allowed! " +
                    "Please, restart the program and enter a number");
        }
        return number;
    }

    public String getOperation() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, select operation. Available options: +, -, *, /");
        if (sc.hasNextLine()) {
            operation = sc.nextLine();
        } else {
            System.out.println("Use available operators: +, -, *, /" +
                    "Please, restart the program!");
        }

        return operation;
    }
}
