package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.itacademy.calculator.CalculatorUtilMethods.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorUtilMethodsRegressionTest {

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3", "10.00, 20.00, 30.00", "-1.0, -2.0, -3.0", "0.5, 0.5, 1.0", "10, -5, 5", "0,0,0"})
    void testAddNumbersWithDifferentParams(double number1, double number2, double result) {
        assertEquals(result, addNumbers(number1, number2), "Wrong result of addition was detected");
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, -1", "100.00, 20.00, 80.00", "-1.0, -2.0, 1.0", "0.5, 0.5, 0", "10, -5, 15", "0, 0, 0", "0.02, 0.01, 0.01"})
    void testSubtractNumbersWithDifferentParams(double number1, double number2, double result) {
        assertEquals(result, subtractNumbers(number1, number2), "Wrong result of subtraction was detected");
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 2", "100.00, 20.00, 2000", "-1.0, -2.0, 2", "0.5, 0.5, 0.25", "10, -5, -50", "0, 0, 0"})
    void testMultiplyNumbersWithDifferentParams(double number1, double number2, double result) {
        assertEquals(result, multiplyNumbers(number1, number2), "Wrong result of multiplication was detected");
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 0.5", "100.00, 20.00, 5", "-1.0, -2.0, 0.5", "0.5, 0.5, 1", "10, -5, -2"})
    void testDivisionNumbersWithDifferentParams(double number1, double number2, double result) throws WrongDataGettingException {
        assertEquals(result, divideNumbers(number1, number2), "Wrong result of division was detected");
    }


}