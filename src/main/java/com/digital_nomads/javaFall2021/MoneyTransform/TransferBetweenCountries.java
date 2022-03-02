package com.digital_nomads.javaFall2021.MoneyTransform;
import static com.digital_nomads.javaFall2021.MoneyTransform.Transfers.*;

public class TransferBetweenCountries {
    public static void main(String[] args) throws Exception {
        Sberbank aziretSberBank = new Sberbank("aziret", "myrzabekov", 21062001, "Kyrgyzstan");
        OptimaBank azamatOptimaBank = new OptimaBank("azamat", "maratov", 15052001, "Kyrgyzstan");

        System.out.println(aziretSberBank.showMoney());
        System.out.println(azamatOptimaBank.showMoney());
        transferMoneyToKg(aziretSberBank, azamatOptimaBank, 13000, "Kyrgyzstan");
        System.out.println(azamatOptimaBank.showMoney());
        transferMoneyToKg(azamatOptimaBank, aziretSberBank, 12000, "Kyrgyzstan");
        System.out.println(aziretSberBank.showMoney());
        transferMoneyToKg(aziretSberBank, azamatOptimaBank, 23000, "Kyrgyzstan");
        System.out.println(aziretSberBank.showMoney());
        System.out.println(azamatOptimaBank.showMoney());


    }
}
