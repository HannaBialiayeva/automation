package com.itacademy.calculator;

import com.itacademy.calculator.exception.WrongDataGettingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static com.itacademy.calculator.Calculator.calculateNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorInputMockitoDraftTest {

    @Mock
    private final CalculatorInputReader calculatorInputReader = new CalculatorInputReader();

    @BeforeEach
    private void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetWrongTestOperationMethod() throws WrongDataGettingException {
        Mockito.when(calculatorInputReader.getOperation()).thenReturn("test");
        WrongDataGettingException ex = assertThrows(WrongDataGettingException.class,
                () ->
                    calculateNumbers(10, 2, calculatorInputReader.getOperation()));
        assertEquals("Exception thrown: Incorrect operation was entered." +
                " Use available operators: +, -, *, / and restart the program!", ex.getMessage());

    }
}
