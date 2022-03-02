package com.digital_nomads.javaFall2021.applications;
import static com.digital_nomads.javaFall2021.applications.Bank.*;

public class BankerDemo {
    public static void main(String[] args) throws Exception{
        DemirBank nursultanDemirBankAccount = new DemirBank(118000001234L, 123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(118000000312L, 987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit " + nursultanDemirBankAccount.getBalance());

        transferFunds(nursultanDemirBankAccount, urmatDemirBankAccount, 2_000);

        System.out.println("Urmat's balance after transfer is " + urmatDemirBankAccount.getBalance());
        System.out.println("Nursultan's balance after transfer is " + nursultanDemirBankAccount.getBalance());

        transferFunds(urmatDemirBankAccount, nursultanDemirBankAccount, 2101);
        System.out.println(nursultanDemirBankAccount.getBalance());
    }
}
