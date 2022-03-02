package com.digital_nomads.javaFall2021.applications;

public interface KKBInterface {
    double getBalance() throws Exception;
    void deposit(double amount) throws Exception;
    void withDraw(double amount) throws Exception;

    static void transferWithMbank(KKBInterface sender, KKBInterface recipient, double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }
}
