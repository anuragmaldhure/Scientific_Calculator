package com.anurag.calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("Starting calculator...");
        StandardCalculator calculator = new StandardCalculator();
        calculator.clearResult();
        calculator.add(Double.MAX_VALUE,1);
        calculator.add(Double.MAX_VALUE,Double.MAX_VALUE);
        System.out.println("Addition = " + calculator.getResult());
    }
}
