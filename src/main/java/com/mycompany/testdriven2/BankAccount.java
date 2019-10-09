package com.mycompany.testdriven2;


public class BankAccount {

    private int balance;

    public void deposit(int i) {
        balance+=i;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int i) {
        balance-=i;
        if(balance<0)
            balance-=6;
    }

    void transfer(BankAccount accountTo, int i) {
        withdraw(i);
        accountTo.deposit(i);
    }
    
}
