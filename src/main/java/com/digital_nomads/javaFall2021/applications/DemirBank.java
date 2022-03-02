package com.digital_nomads.javaFall2021.applications;

public class DemirBank extends BankBase{
    private double balance = 100;


    public DemirBank(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception{
        if (amount < 0 || amount > 20_000)  {
            throw new Exception("Invalid amount");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception{
        if (amount < 0 || amount > 5_000) {
            throw new Exception("Invalid amount, can not be withdraw");
        } else if (balance < amount) {
            throw new Exception("Insufficient founds");
        } else {
            balance -= amount;
        }
    }
}
