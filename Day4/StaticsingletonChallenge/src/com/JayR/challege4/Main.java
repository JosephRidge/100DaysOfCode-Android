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
        Boolean inactive = true;
        landingPage();


    }

    public static void landingPage(){
        System.out.println("Hello There good person, Welcome! Kindly pick an option");
        System.out.println("1. Manage Contacts.");
        System.out.println("2. Messages.");
        System.out.println("3. Quit");
        Scanner scanner = new Scanner(System.in);

        Integer choice = scanner.nextInt();

        if (choice == 1) {
            firstChoice();

        } else if (choice == 2) {
            secondChoice();
        }else if (choice == 3){
            return;
        }
    }
    public static void firstChoice(){
        System.out.println("\t1. Show All Contacts.");
        System.out.println("\t2. Add new contact. ");
        System.out.println("\t3. Search for a contact. ");
        System.out.println("\t4. Delete contact. ");
        System.out.println("\t5. Go Back to previous menu. ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Contacts : \n");
                break;
            case 2:
                System.out.println("Add new Contact : \n");
                break;
            case 3:
                System.out.println("Kindly input the contact you would like to get : \n");
                String contactToSearch = scanner.next();

                break;
            case 4:
                System.out.println("Which contact would you like to Remove  : \n");
                String contactToRemove = scanner.next();

                break;
            case 5:
                landingPage();
            default:
                return;


        }
    }

    public static void secondChoice(){
        System.out.println("\t1. See the list of all messages. ");
        System.out.println("\t2. Send a new message.");
        System.out.println("\t3. Go Back to previous menu.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Messages : \n");
                break;
            case 2:
                System.out.println("Kindly input the message you would like to send : \n");
                System.out.println("Kindly input the contact you would like to send to : \n");

                break;

            case 3:
                landingPage();
            default:
                return;

        }
    }
}

