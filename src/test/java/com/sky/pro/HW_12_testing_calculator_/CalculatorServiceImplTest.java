package com.sky.pro.HW_12_testing_calculator_;

import static com.sky.pro.HW_12_testing_calculator_.numbers.numbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sky.pro.HW_12_testing_calculator_.exceptions.OneOfTheNumbersIsZeroException;
import com.sky.pro.HW_12_testing_calculator_.services.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectResultWhenAddingIsCorrect() {

        String actual = calculatorServiceImpl.plus(num1, num2);

        assertEquals("5 + 5 = 10", actual);
    }
    @Test
    public void shouldReturnCorrectResultWhenAddingIsCorrect2() {

        String actual = calculatorServiceImpl.plus(num3, num4);

        assertEquals("6 + 6 = 12", actual);
    }

    @Test

    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenAdding() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num1, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenSubtractingIsCorrect() {
        String actual = calculatorServiceImpl.minus (num1, num2);
        assertEquals("5 - 5 = 0", actual);
    }
    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenSubtracting() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num1, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenMultiplyingIsCorrect() {
        String actual = calculatorServiceImpl.multiply(num1, num2);
        assertEquals("5 * 5 = 25", actual);
    }
    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenMultiplying() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num1, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenDividingIsCorrect() {
        String actual = calculatorServiceImpl.divide(num1, num2);
        assertEquals("5 / 5 = 1", actual);
    }
    @Test
    public void shouldOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenDividing() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.divide(num1,  NULL));
    }

}