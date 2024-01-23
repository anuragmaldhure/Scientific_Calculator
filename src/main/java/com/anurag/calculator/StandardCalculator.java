package com.anurag.calculator;

public class StandardCalculator {

    protected double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

//    public static void main(String[] args) {
//        StandardCalculator.getVersion();
//    }

    public final void add(int num1, int num2){      //final used in these methods
        add((double)num1, (double)num2);
    }
    public final void add(double num1, double num2){
        double result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void subtract(int num1, int num2){
        subtract((double)num1, (double)num2);
    }
    public final void subtract(double num1, double num2){
        double result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void multiply(int num1, int num2){
        multiply((double)num1, (double)num2);
    }
    public final void multiply(double num1, double num2){
        double result = num1 * num2;
        if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void divide(int num1, int num2){
        divide((double)num1, (double)num2);
    }
    public void divide(double num1, double num2){
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        result = num1 / num2;
    }

    //Helper method
    public final void clearResult(){
        result = 0;
    }

    //getter and setter
    public double getResult() {
        return result;
    }

    public void setResult(double value) {
        this.result = value;
    }

    //helper method
    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }

}
