package com.sky.pro.HW_12_testing_calculator_;

import com.sky.pro.HW_12_testing_calculator_.exceptions.OneOfTheNumbersIsZeroException;
import com.sky.pro.HW_12_testing_calculator_.services.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.sky.pro.HW_12_testing_calculator_.numbers.numbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    public static Stream<Arguments> paramsForTests() {
        return Stream.of(
                Arguments.of(num1, num2, NULL)
        );
    }

    public static Stream<Arguments> paramsForTests2() {
        return Stream.of(
            Arguments.of(num3, num4,NULL)
        );
    }
    public static Stream<Arguments> paramsForTheDivide_0_Tests() {
        return Stream.of(
                Arguments.of(num1, num_0),
                Arguments.of(num2, num_0)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")

    public void shouldReturnCorrectAdding(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num1, NULL));

        String actual = calculatorServiceImpl.plus(num1, num2);

        assertEquals("5 + 5 = 10", actual );
    }

    @MethodSource("paramsForTests2")

    public void shouldReturnCorrectAdding2(Integer num3, Integer num4, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num3, NULL));

        String actual = calculatorServiceImpl.plus2(num3, num4);

        assertEquals("6 + 6 = 12", actual );
    }

    @MethodSource("paramsForTests")
    public void shouldReturnCorrectSubtracting(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num1, NULL));

        String actual = calculatorServiceImpl.minus(num1, num2);

        assertEquals("5 - 5 = 0", actual);
    }

    @MethodSource("paramsForTests2")
    public void shouldReturnCorrectSubtracting2(Integer num3, Integer num4, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num3, NULL));

        String actual = calculatorServiceImpl.minus(num3, num4);

        assertEquals("6 - 6 = 0", actual);
    }

    @MethodSource("paramsForTests")
    public void shouldReturnCorrectMultiplying(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num1, NULL));

        String actual = calculatorServiceImpl.multiply(num1, num2);

        assertEquals("5 * 5 = 25", actual);
    }

    @MethodSource("paramsForTests2")
    public void shouldReturnCorrectMultiplying2(Integer num3, Integer num4, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num3, NULL));

        String actual = calculatorServiceImpl.multiply(num3, num4);

        assertEquals("6 * 6 = 36", actual);
    }

    @MethodSource("paramsForTests")
    public void shouldReturnCorrectDividing(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class,  () -> calculatorServiceImpl.divide(num1, NULL));

        String actual = calculatorServiceImpl.divide(num1, num2);
        assertEquals("5 / 5 = 1", actual);
    }

    @MethodSource("paramsForTests2")
    public void shouldReturnCorrectDividing2(Integer num3, Integer num4, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class,  () -> calculatorServiceImpl.divide(num3, NULL));

        String actual = calculatorServiceImpl.divide(num3, num4);
        assertEquals("6 / 6 = 1", actual);
    }
    @MethodSource("paramsForTheDivide_0_Tests")
    public void divide_0_ParametrizedTest(Integer num1, int num_0){
        assertThrows(IllegalArgumentException.class, () ->  calculatorServiceImpl.divide(num1, num_0));
    }


}

