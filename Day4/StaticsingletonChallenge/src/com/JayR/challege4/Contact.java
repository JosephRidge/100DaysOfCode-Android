package com.JayR.challege4;

public class Contact{

    private  String Name;
    private  String PhoneNumber;
    private  static String message;

    public Contact(String name, String phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        Contact.message = message;
    }
    /*public Contact() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public void userMessages(String text) {

    }

    @Override
    public void userContacts(String name) {
        System.out.println("Name :"+getName() + ".\n Telephone No. "+getPhoneNumber());
    }*/

}
