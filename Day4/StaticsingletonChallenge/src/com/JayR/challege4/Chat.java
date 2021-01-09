package com.JayR.challege4;

public class Chat extends  Contact{
    private static String text ;

    public Chat(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        Chat.text = text;
    }
}
