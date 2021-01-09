package com.JayR.challege4;

public class Contact implements ChatInterface{
    private static String Name;
    private static Integer PhoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public void userMessages(String text) {

    }

    @Override
    public void userContacts(String name) {
        System.out.println("Name :"+getName() + ".\n Telephone No. "+getPhoneNumber());
    }
}
