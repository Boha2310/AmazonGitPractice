package com.digital_nomads.javaFall2021.MoneyTransform;

public abstract class AccountBank implements Transfers{
    private String name;
    private String lastName;
    private int numCard;
    private String country;

    public AccountBank(String name, String lastName, int numCard, String country) throws Exception {
        if(Integer.toString(numCard).length() != 8) {
            throw new Exception("Error --> numCard's length is 16!");
        } else {
            this.name = name;
            this.lastName = lastName;
            this.numCard = numCard;
            this.country = country;
        }
    }



    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
