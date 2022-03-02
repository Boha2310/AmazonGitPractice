package com.digital_nomads.javaFall2021.MoneyTransform;

public class OptimaBank extends AccountBank{
    private double money;

    public OptimaBank(String name, String lastName, int numCard, String country) throws Exception {
        super(name, lastName, numCard, country);
    }



    @Override
    public double showMoney() {
        return money;
    }

    @Override
    public void plusMoney(double transferMoney) throws Exception {
        if (transferMoney < 0 || transferMoney > 50_000) {
            throw new Exception("Invalid money!!!");
        } else {
            money = money + transferMoney;
        }
    }

    @Override
    public void minusMoney(double transferMoney, String country) throws Exception {
        if (transferMoney < 0 || transferMoney > 50_000 && country.equals(getCountry())) {
            throw new Exception("Error!!!");
        } else if (money < transferMoney) {
            throw new Exception("not enough money");
        } else {
            money = money - transferMoney;
        }
    }
}
