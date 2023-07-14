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
                Arguments.of(num1, num2, NULL),
                Arguments.of(num3, num4,NULL),
                Arguments.of(5, 6,NULL),
                Arguments.of(100, 600,0),
                Arguments.of(200, 300,0)

        );
    }

    public static Stream<Arguments> paramsForTheDivide_0_Tests() {
        return Stream.of(
                Arguments.of(num1,num3, num_0)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")

    public void shouldReturnCorrectAdding(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.plus(num1, NULL));

        String actual = calculatorServiceImpl.plus(num1, num2);
        Integer expected =  num1 +  num2;
        assertEquals(num1 + " + " + num2 +" = " + expected   , actual );
    }





    @MethodSource("paramsForTests")
    public void shouldReturnCorrectSubtracting(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.minus(num1, NULL));

        String actual = calculatorServiceImpl.minus(num1, num2);

        Integer expected =  num1  -  num2;
        assertEquals(num1 + " - " + num2 +" = " + expected   , actual );
    }




    @MethodSource("paramsForTests")
    public void shouldReturnCorrectMultiplying(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class, () -> calculatorServiceImpl.multiply(num1, NULL));

        String actual = calculatorServiceImpl.multiply(num1, num2);

        Integer expected =  num1  *  num2;
        assertEquals(num1 + "  * " + num2 +" = " + expected   , actual );
    }




    @MethodSource("paramsForTests")
    public void shouldReturnCorrectDividing(Integer num1, Integer num2, Integer numNull) {
        assertThrows(OneOfTheNumbersIsZeroException.class,  () -> calculatorServiceImpl.divide(num1, NULL));
        String actual = calculatorServiceImpl.divide(num1, num2);

        Integer expected =  num1  /  num2;
        assertEquals(num1 + "/ " + num2 +" = " + expected   , actual );
    }



    @MethodSource("paramsForTheDivide_0_Tests")
    public void divide_0_ParametrizedTest(Integer num1, int num_0){
        assertThrows(IllegalArgumentException.class, () ->  calculatorServiceImpl.divide(num1, num_0));
    }


}

