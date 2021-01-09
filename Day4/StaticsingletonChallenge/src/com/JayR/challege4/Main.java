package com.JayR.challege4;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static ArrayList<Message>messages = new ArrayList<>();
    private static Map<String, String> myContacts = new HashMap<>();
    private static Map<Contact,Message> chat = new HashMap<>();
    /*
    * Simulate your phone's contacts and messages applications
    *
    * Greet user
    * Show 3 options : 1. Manage contacts 2. Messages 3. Quite
    * in case of selecting 1 -> Show this options:
    *       1. Show all contacts
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
        System.out.println("Hello There good person, Welcome! Kindly pick an option");
        landingPage();

    }

    public static void landingPage(){
        System.out.println("1. Manage Contacts.");
        System.out.println("2. Messages.");
        System.out.println("3. Quit\n");
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
        Contact contact = new Contact();
        int choice = scanner.nextInt();
        int i=1;

        switch(choice){
            case 1:
                System.out.println("Contacts : \n");
//                System.out.println("Name :"+myContacts.get(contact.getName())+" Tel. : "+myContacts.get(contact.getPhoneNumber()));
                System.out.println(new StringBuilder().append(i).append(" .Name : ")
                        .append(myContacts.get(contact.getName()))
                        .append(".\nTelephon No. : ").append(myContacts.get(contact.getPhoneNumber()))
                        .append(".\n").toString());

                landingPage();
            case 2:
                System.out.println("Add new Contact : \n Input name: ");
                String newContactname = scanner.next();
                System.out.println("Input PhoneNumber: ");
                Integer newContactNumber = scanner.nextInt();
                contact.setName(newContactname);
                contact.setPhoneNumber(newContactNumber.toString());
                myContacts.put(contact.getName(), contact.getPhoneNumber());
                System.out.println(myContacts);

                landingPage();

            case 3:
                System.out.println("Kindly input the name of the contact you would like to get : \n");
                String contactToSearch = scanner.next();
                myContacts.containsKey(contactToSearch);

                System.out.println("Your contact is : "+myContacts.containsKey(contactToSearch) +myContacts.containsValue(contactToSearch));
                landingPage();
            case 4:
                System.out.println("Which contact would you like to Remove  : \n");
                String contactToRemove = scanner.next();
                landingPage();
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

