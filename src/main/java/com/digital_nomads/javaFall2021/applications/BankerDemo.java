package com.digital_nomads.javaFall2021.applications;
import static com.digital_nomads.javaFall2021.applications.Bank.*;

public class BankerDemo {
    public static void main(String[] args) throws Exception{
        DemirBank nursultanDemirBankAccount = new DemirBank(118000001234L, 123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(118000000312L, 987654321);


        nursultanDemirBankAccount.deposit(5000);


        transferFunds(nursultanDemirBankAccount, urmatDemirBankAccount, 2_000);



        transferFunds(urmatDemirBankAccount, nursultanDemirBankAccount, 2101);

    }
}
