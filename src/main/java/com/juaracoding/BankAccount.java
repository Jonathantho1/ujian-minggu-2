package com.juaracoding;

public class BankAccount {

    private int accNo;
    private String name;
    private double amount;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount(int accNo, String name, double amount) {
        this.accNo = accNo;
        this.name = name;
        this.amount = amount;
    }

    public BankAccount(){

    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(accNo + " " + name + " " + amount);
    }
}
