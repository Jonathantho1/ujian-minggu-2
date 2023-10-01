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
        setAmount(getAmount()+amt);
        System.out.println(amt + " deposited");
        return getAmount();
    }

    public double withdraw(double amt) {
        if (getAmount() < amt) {
            System.out.println("Insufficient Balance");
        } else {
            setAmount(getAmount()-amt);
            System.out.println(amt + " withdrawn");
        }
        return getAmount();
    }

    public String checkBalance() {
        return "Balance is: " + getAmount();
    }

    public String display() {
        return getAccNo() + " " + getName() + " " + getAmount();
    }
}
