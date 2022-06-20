package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import static com.itacademy.calculator.Calculator.calculateNumbers;
import static org.junit.jupiter.api.Assertions.*;


@Execution(ExecutionMode.CONCURRENT)
public class CalculatorTest {

    @Test
    public void testCalculateSimpleNumbers() throws WrongDataGettingException {
        assertAll("At least 1 test was failed",
                ()-> assertEquals(-2, calculateNumbers(-10,5,"/"), "Incorrect result of division was detected"),
                ()-> assertEquals(0.15, calculateNumbers(0.15,1,"*"), "Incorrect result of multiplication was detected"),
                ()-> assertEquals(10.1, calculateNumbers(10,0.1,"+"), "Incorrect result of addition was detected"),
                ()-> assertEquals(15, calculateNumbers(10.0,-5.0,"-"), "Incorrect result of subtraction was detected")
        );
    }
    @Test
    public void testGetWrongOperationExceptionDuringCalculation(){
        WrongDataGettingException ex = assertThrows(WrongDataGettingException.class,
                () ->
                        calculateNumbers(10, 2, "test"));
        assertEquals("Exception thrown: Incorrect operation was entered." +
                " Use available operators: +, -, *, / and restart the program!", ex.getMessage());
    }

    @Test
    public void testMultiplyByZero() throws WrongDataGettingException {
        assertEquals(0, calculateNumbers(2.920989, 0,"*"), "Incorrect result of multiplication was detected!");
    }

    @Test
    public void testDivideByZero() {
        WrongDataGettingException ex = assertThrows(WrongDataGettingException.class,
                () -> calculateNumbers(9.0, 0, "/"));
        assertEquals("Exception thrown: Incorrect data was entered." +
                "It's not possible to divide by 0. Please,restart program!", ex.getMessage());
    }
}


