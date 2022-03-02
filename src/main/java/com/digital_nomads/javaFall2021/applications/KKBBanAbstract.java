package com.digital_nomads.javaFall2021.applications;

public abstract class KKBBanAbstract implements KKBInterface{
    private String phoneNumber;

    public KKBBanAbstract(String phoneNumber) throws Exception {
        if (phoneNumber.length() != 13 || !phoneNumber.startsWith("+")) {
            throw new Exception("Invalid phone number");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
