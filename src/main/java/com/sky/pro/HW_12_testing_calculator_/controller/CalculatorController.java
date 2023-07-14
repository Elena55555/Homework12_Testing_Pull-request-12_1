package com.sky.pro.HW_12_testing_calculator_.controller;


import com.sky.pro.HW_12_testing_calculator_.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService  calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping(path = "/plus")
    public String plus (@RequestParam(required = false, name = "num1")  Integer num1,
                        @RequestParam(required = false,name = "num2") Integer num2) {
        return  calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false, name = "num1")  Integer num1,
                        @RequestParam(required = false,name = "num2") Integer num2) {
        return  calculatorService.minus( num1,  num2) ;
    }


    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1,
                           @RequestParam(required = false,name = "num2") Integer num2) {
        return   calculatorService.multiply(num1, num2) ;
    }


    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1,
                         @RequestParam(required = false,name = "num2") Integer num2) {
        return calculatorService.divide(num1, num2)  ;
    }
}