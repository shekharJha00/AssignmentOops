package com.bridgelabz.oops;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Transaction Successfull !");
            System.out.println("Remaining balance in your account is : " + balance);
        } else
            System.out.println("Debit amount exceeded account balance.");
    }}