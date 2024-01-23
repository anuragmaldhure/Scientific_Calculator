package com.anurag.calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("Starting calculator...");
        StandardCalculator calculator = new StandardCalculator();
        calculator.clearResult();
        calculator.add(1,2);
        System.out.println("Addition = " + calculator.getResult());
    }
}
