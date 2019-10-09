package com.mycompany.testdriven2;


import java.util.ArrayList;

public class FakeIO implements ConsoleIO {
    int[] numbers;
    ArrayList<String> output = new ArrayList<>();
    int index=0;

    public FakeIO(int[] numbers) {
        this.numbers=numbers;
    }
    //bliver kaldt fra CalculatorUI i stedet for en scanner
    @Override
    public int getUserInput() {
        return numbers[index++];
    }
    
    //bliver kaldt fra CalculatorUI i stedet for System.out.println
    @Override
    public void printLine(String line) {
        output.add(line);
    }
    
}
