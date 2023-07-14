package com.sky.pro.HW_12_testing_calculator_.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class DivisionByZeroIsNotAllowedException extends  RuntimeException {

    public DivisionByZeroIsNotAllowedException(String message) {
        super(message);
    }
}
