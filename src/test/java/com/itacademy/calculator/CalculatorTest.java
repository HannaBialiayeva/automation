package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collection;

import static com.itacademy.calculator.Calculator.calculateNumbers;
import static com.itacademy.calculator.CalculatorUtilMethods.addNumbers;
import static com.itacademy.calculator.CalculatorUtilMethods.multiplyNumbers;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({})
public class CalculatorTest {

//    private double number1;
//    private double number2;
//    private double result;
//    private Calculator calculator;
//
//    public CalculatorTest(double number1, double number2, double result) {
//        this.number1 = number1;
//        this.number2 = number2;
////        this.result = result;
//    }
//
//    @ParameterizedTest
//    public static Collection<Object[]> data() {
//        Object[][] data = new Object[][]{{1, 1, 2}, {-1, -1, -2}, {0.1, 0.2, 0.3}};
//        return Arrays.asList(data);
//    }
////    @BeforeEach
////    public void init(){
////        calculator = new Calculator();
////    }


    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "10, 20, 30"
    })
     void testAddNumbersWithParams(double number1, double number2, double result){
        assertEquals(result, addNumbers(number1,number2), "Wrong");
    }

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


