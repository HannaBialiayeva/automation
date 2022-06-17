package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.Test;

import static com.itacademy.calculator.CalculatorUtilMethods.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUtilMethodsTest {

    @Test
    public void testMultiplyNumbers() {
        assertEquals(6, multiplyNumbers(2, 3), "Incorrect result of multiplication!");
    }

    @Test
    public void testSubtractNumbers() {
        assertEquals(45, subtractNumbers(50, 5), "Incorrect result of subtraction!");
    }
    @Test
    public void testAddNumbers() {
        assertEquals(40, addNumbers(10, 30), "Incorrect result of addition!");
    }

    @Test
    public void testDivideNumbers() throws WrongDataGettingException {
        assertEquals(3, divideNumbers(30, 10), "Incorrect result of division!");
    }



}