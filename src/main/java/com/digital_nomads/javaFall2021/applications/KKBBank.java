package com.digital_nomads.javaFall2021.applications;

public class KKBBank extends KKBBanAbstract{
    private double balance;

    public KKBBank(String phoneNumber) throws Exception {
        super(phoneNumber);
    }


    @Override
    public double getBalance() throws Exception {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0 || amount > 100_000)  {
            throw new Exception("Invalid amount");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount < 0 || amount > 100_000) {
            throw new Exception("Invalid amount, can not be withdraw");
        } else if (balance < amount) {
            throw new Exception("Insufficient founds");
        } else {
            balance -= amount;
        }
    }
}
