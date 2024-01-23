package com.anurag.calculator;

public class StandardCalculator {

    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

//    public static void main(String[] args) {
//        StandardCalculator.getVersion();
//    }

    public void add(int num1, int num2){
        setResult(num1+num2);
    }

    public void subtract(int num1, int num2){
        setResult(num1-num2);
    }

    public void multiply(int num1, int num2){
        setResult(num1*num2);
    }

    public void divide(int num1, int num2){
        setResult(num1/num2);
    }

    //Helper method
    public void clearResult(){
        result = 0;
    }

    //getter and setter
    public int getResult() {
        return result;
    }

    public void setResult(int value) {
        this.result = value;
    }
}
