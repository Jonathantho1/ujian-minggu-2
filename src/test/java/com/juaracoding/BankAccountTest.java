package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {

    BankAccount bankAccount = new BankAccount(10011103,"Jonathantho",10000);

    @Test (priority = 1)
    public void depositTest(){
        Assert.assertEquals(bankAccount.deposit(10000),20000);
    }

    @Test (priority = 2)
    public void withdrawTestLessAmount(){
        Assert.assertEquals(bankAccount.withdraw(10000),10000);
    }

    @Test (priority = 3)
    public void withdrawTestMoreAmount(){
        Assert.assertEquals(bankAccount.withdraw(25000),10000);
    }

    @Test (priority = 4)
    public void checkBalanceTest(){
        Assert.assertEquals(bankAccount.checkBalance(), "Balance is: 10000.0");
    }

    @Test (priority = 5)
    public void displayTest(){
        Assert.assertEquals(bankAccount.display(), "10011103 Jonathantho 10000.0");
    }
}