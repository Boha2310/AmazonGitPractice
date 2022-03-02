package com.digital_nomads.javaFall2021.MoneyTransform;

public interface Transfers {
    double showMoney();
    void plusMoney(double transferMoney) throws Exception;
    void minusMoney(double transferMoney, String country) throws Exception;

    static void transferMoneyToKg(Transfers otpravitel, Transfers poluchatel, double transferMoney, String country) throws Exception{
         if (!country.equals("Kyrgyzstan")) {
             throw new Exception("Printing your country in correct");
         } else {
             otpravitel.minusMoney(transferMoney, country);
             poluchatel.plusMoney(transferMoney);
         }
    }
}
