package com.sky.pro.HW_12_testing_calculator_;


import com.sky.pro.HW_12_testing_calculator_.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class CalculatorTest {
    int num1 = 5;
    int num2= 5;

    int num0 = 0;
    private final Calculator calculator = new Calculator();


    @Test
    public void plusTest() {

        int actual = calculator.plus(num1, num2);
        assertEquals(10, actual);
    }

    @Test
    public void minusTest() {

        int actual = calculator.minus(num1, num2);
        assertEquals(0, actual);
    }

    @Test
    public void multiplyTest() {

        int actual  = calculator.multiply(num1, num2);
        assertEquals(25, actual );
    }

    @Test
    public void divideTest() {

        int actual  = calculator.divide(num1, num2);
        assertEquals(1, actual );
    }

}

