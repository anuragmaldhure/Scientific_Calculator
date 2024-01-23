package com.anurag.calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("Starting calculator...");
//        StandardCalculator calculator = new StandardCalculator();
//        calculator.clearResult();
//        calculator.add(Double.MAX_VALUE,1);
//        calculator.add(Double.MAX_VALUE,Double.MAX_VALUE);
//        System.out.println("Addition = " + calculator.getResult());
//        ScientificCalculator scalc = new ScientificCalculator();
//        calc.add(12.22, 19.2);
//        System.out.println(calc.getResult());
//        calc.printResult();
//        //scalc.add(Double.MAX_VALUE,23); How to prevent this method from calling/overriding => final
//        scalc.square(25);
//        System.out.println(scalc.getResult());
//        scalc.printResult();
		/*
		Changed from add and subtract test to multipky and divide
		calc.multiply(Double.MAX_VALUE, 1.0);
		calc.printResult();
		calc.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
		calc.printResult();
		calc.divide(Double.MIN_VALUE, 1.0);
		calc.printResult();
		calc.divide(Double.MIN_VALUE, Double.MIN_VALUE);
		calc.printResult(); */

        LogicCalculator lcalc = new LogicCalculator();
        lcalc.OR(8, 6);
        lcalc.printResult();
    }
}
