package com.mycompany.testdriven2;


import java.util.Scanner;

public class SystemIO implements ConsoleIO {
    Scanner scanner = new Scanner(System.in);
    public SystemIO() {
    }

    @Override
    public int getUserInput() {
        return scanner.nextInt();
    }

    @Override
    public void printLine(String line) {
        System.out.println(line);
    }
    
}
