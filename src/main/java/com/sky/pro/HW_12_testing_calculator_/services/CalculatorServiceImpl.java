package com.sky.pro.HW_12_testing_calculator_.services;

import com.sky.pro.HW_12_testing_calculator_.exceptions.DivisionByZeroIsNotAllowedException;
import com.sky.pro.HW_12_testing_calculator_.exceptions.OneOfTheNumbersIsZeroException;
import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b> Welcome to this calculator </b>";
    }
    @Override
    public String plus(Integer num1, Integer num2) {
        checkTheNumbers  (num1, num2);
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @Override
    public String plus2(Integer num3, Integer num4) {
        checkTheNumbers  (num3, num4);
        return num3 + " + " + num4 + " = " + (num3 + num4);
    }
    @Override
    public String minus(Integer num1, Integer num2) {
        checkTheNumbers  (num1, num2);
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override
    public String multiply(Integer num1, Integer num2) {
        checkTheNumbers  (num1, num2);
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String divide(Integer num1, Integer num2) {
        checkTheNumbers  (num1, num2);
        if (num2 == 0) {
            throw new DivisionByZeroIsNotAllowedException("Mistake! You can't divide by zero");
        } else return num1 + " / " + num2 + " = " + (num1 / num2);
    }
    private void checkTheNumbers (Integer num1, Integer num2) throws OneOfTheNumbersIsZeroException {
        if ( num1 == null || num2 == null) {
            throw new OneOfTheNumbersIsZeroException("One of the entered numbers is zero");
        }
    }
}

