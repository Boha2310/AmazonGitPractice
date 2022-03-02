package com.digital_nomads.javaFall2021.applications;
import static com.digital_nomads.javaFall2021.applications.KKBInterface.*;

public class KKBDemo {
    public static void main(String[] args) throws Exception {
        KKBBank aziretMBank = new KKBBank("+996508210601");
        KKBBank azamatMBank = new KKBBank("+996555150501");

        aziretMBank.deposit(100_000);

        transferWithMbank(aziretMBank, azamatMBank, 10_000);
        System.out.println("Aziret's balance " + aziretMBank.getBalance());
        System.out.println("Azamat's balance " + azamatMBank.getBalance());

        System.out.println("Aziret's phone " + aziretMBank.getPhoneNumber());
        System.out.println("Azamat's phone " + azamatMBank.getPhoneNumber());
    }
}
