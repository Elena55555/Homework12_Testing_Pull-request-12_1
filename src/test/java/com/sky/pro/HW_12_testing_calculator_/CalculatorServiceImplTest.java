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
    public void shouldReturnCorrectResultWhenAddingIsCorrect1() {

        String actual = calculatorServiceImpl.plus(num1, num2);

        assertEquals("5 + 5 = 10", actual);
    }


    @Test

    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenAdding1 () {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num1, NULL));
    }


    @Test
    public void shouldReturnCorrectResultWhenAddingIsCorrect2() {

        String actual = calculatorServiceImpl.plus(num3, num4);

        assertEquals("6 + 6 = 12", actual);
    }

    @Test

    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenAdding2() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num3, NULL));
    }



    @Test
    public void shouldReturnCorrectResultWhenSubtractingIsCorrect1() {
        String actual = calculatorServiceImpl.minus (num1, num2);
        assertEquals("5 - 5 = 0", actual);
    }


    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenSubtracting1() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num1, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenSubtractingIsCorrect2() {
        String actual = calculatorServiceImpl.minus (num3, num4);
        assertEquals("6 - 6 = 0", actual);
    }


    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenSubtracting2() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num3, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenMultiplyingIsCorrect1() {
        String actual = calculatorServiceImpl.multiply(num1, num2);
        assertEquals("5 * 5 = 25", actual);
    }
    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenMultiplying1() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num1, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenMultiplyingIsCorrect2() {
        String actual = calculatorServiceImpl.multiply(num3, num4);
        assertEquals("6 * 6 = 36", actual);
    }
    @Test
    public void shouldThrowOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenMultiplying2() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num3, NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenDividingIsCorrect1() {
        String actual = calculatorServiceImpl.divide(num1, num2);
        assertEquals("5 / 5 = 1", actual);
    }
    @Test
    public void shouldOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenDividing1() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.divide(num1,  NULL));
    }

    @Test
    public void shouldReturnCorrectResultWhenDividingIsCorrect2() {
        String actual = calculatorServiceImpl.divide(num3, num4);
        assertEquals("6 / 6 = 1", actual);
    }
    @Test
    public void shouldOneOfTheNumbersIsZeroExceptionWhenThereIsAValueOfNullWhenDividing2() {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.divide(num3,  NULL));
    }

}