package com.sky.pro.HW_12_testing_calculator_.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class   ExceptionHandlerCalculator {
    @ExceptionHandler(OneOfTheNumbersIsZeroException.class)

    public ResponseEntity<String> handleOneOfTheNumbersIsZeroException(OneOfTheNumbersIsZeroException oneOfTheNumbersIsZeroException) {
        oneOfTheNumbersIsZeroException.printStackTrace();
        System.out.println("You must enter the values");
        return new   ResponseEntity  <String>(oneOfTheNumbersIsZeroException.getMessage(), HttpStatus.BAD_REQUEST);
    }



    @ExceptionHandler(DivisionByZeroIsNotAllowedException.class)
    public ResponseEntity<String> handleDivisionByZeroIsNotAllowedException (DivisionByZeroIsNotAllowedException divisionByZeroIsNotAllowedException) {
        divisionByZeroIsNotAllowedException.printStackTrace();
        System.out.println("It is impossible to divide by 0");
        return new ResponseEntity<String>(divisionByZeroIsNotAllowedException.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }
}
