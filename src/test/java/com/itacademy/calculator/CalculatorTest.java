package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.*;
import static com.itacademy.calculator.Calculator.calculateNumbers;
import static com.itacademy.calculator.CalculatorUtilMethods.multiplyNumbers;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, multiplyNumbers(2.920989, 0), "Incorrect result of multiplication!");
    }

    @Test
    public void testDivideByZero() {
        WrongDataGettingException ex = assertThrows(WrongDataGettingException.class,
                () -> calculateNumbers(9.0, 0, "/"));
        assertEquals("Exception thrown: Incorrect data was entered." +
                "It's not possible to divide by 0. Please,restart program!", ex.getMessage());
    }
}


