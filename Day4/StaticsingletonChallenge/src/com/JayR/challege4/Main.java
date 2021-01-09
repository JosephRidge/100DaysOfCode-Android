package com.JayR.challege4;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    /*
    * Simulate your phone's contacts and messages applications
    *
    * Greet user
    * Show 3 options : 1. Manage contacts 2. Messages 3. Quite
    * in case of selecting 1 -> Show this options:
    *       1.Show all contacts
    *       2. Add new contact
    *       3. Search for a contact
    *       4. Delete contact
    *       5. Go back to previous menu
    * in case of 2 -> show this options :
    *       1. See the list of all messages
    *       2. Send a new message
    *       3. Go back to previous menu
    * in case 3 Quit application
    * */

    public static void main(String[] args) {
        Boolean inactive = false;

        System.out.println("Hello There good person, Welcome! Kindly pick an option");
        System.out.println("1. Manage Contacts.");
        System.out.println("2. Messages.");
        System.out.println("3. Quit");
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\t1. Show All Contacts.");
            System.out.println("\t2. Add new contact. ");
            System.out.println("\t3. Search for a contact. ");
            System.out.println("\t4. Delete contact. ");
            System.out.println("\t5. Go Back to previous menu. ");
        } else if (choice == 2) {
            System.out.println("\t1. See the list of all messages. ");
            System.out.println("\t2. Send a new message.");
            System.out.println("\t3. Go Back to previous menu.");

        }
    }
}
