package com.mycompany.testdriven2;


public class Main {
    public static void main(String[] args) {
        ConsoleIO io = new SystemIO();
        CalculatorUI calculatorUI = new  CalculatorUI(io);
        calculatorUI.start();
    }
}
