package com.anurag.calculator;

public class StandardCalculator {

    private double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

//    public static void main(String[] args) {
//        StandardCalculator.getVersion();
//    }

    public void add(int num1, int num2){
        setResult(num1+num2);
    }


    public void add(double num1, double num2){
        double result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void subtract(int num1, int num2){
        setResult(num1-num2);
    }

    public void subtract(double num1, double num2){
        double result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void multiply(int num1, int num2){
        setResult(num1*num2);
    }

    public void multiply(double num1, double num2){
        double result = num1 * num2;
        this.result = result;
    }

    public void divide(int num1, int num2){
        setResult(num1/num2);
    }

    public void divide(double num1, double num2){
        double result = num1 / num2;
        this.result = result;
    }

    //Helper method
    public void clearResult(){
        result = 0;
    }

    //getter and setter
    public double getResult() {
        return result;
    }

    public void setResult(double value) {
        this.result = value;
    }
}
