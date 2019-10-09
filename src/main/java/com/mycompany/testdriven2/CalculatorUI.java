package com.mycompany.testdriven2;


public class CalculatorUI {
    
    ConsoleIO io;
    Calculator calculator = new Calculator();       
    public CalculatorUI(ConsoleIO io) {
        this.io=io;
         
    }

    void start() {
        io.printLine("Velkommen til lommeregneren der kan lægge to tal sammen. Skriv det første tal og tryk Enter");
        int første = io.getUserInput();
        io.printLine("Skriv næste tal og tryk ENTER");
        int andet = io.getUserInput();
        int sum = calculator.add(første, andet);
        io.printLine("Summen af de to tal er "+ sum);
        
    }
    
}
