package com.JayR.challege4;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static ArrayList<String>messages ;
    private static ArrayList<Integer>receiverPhoneNumbers ;
//    private static ArrayList<Contact> contactDetails = new ArrayList<>();
//    private static ArrayList<String> contactPhon = new ArrayList<>();
    private static ArrayList<String> contacts;
    private static ArrayList<String> phoneNumbers;
    private  static Map<String,String>contactMap ;
    private static Map<Contact, Chat> chat ;

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
        messages = new ArrayList<>();
        receiverPhoneNumbers = new ArrayList<>();
        contacts= new ArrayList<>();
        phoneNumbers= new ArrayList<>();
        contactMap= new HashMap();
        chat= new HashMap<>();
        Boolean inactive = true;
        System.out.println("Hello There good person, Welcome! Kindly pick an option");
        landingPage();

    }

    public static void landingPage(){
        System.out.println("1. Manage Contacts.");
        System.out.println("2. Messages.");
        System.out.println("3. Quit\n\n");
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
                for(int i=0; i<contacts.size(); i++) {
                    System.out.println("************ "+i+" ************");
                    System.out.println("Name : " + contacts.get(i)+"."
                            + " \nPhoneNumber : "+phoneNumbers.get(i)+".");
                    System.out.println("************************\n");
                 }
                landingPage();
            case 2:
                System.out.println("Add new Contact : \n Input name: ");
                String newContactName = scanner.next();
                System.out.println("Input PhoneNumber: ");
                Integer newContactNumber = scanner.nextInt();
                Contact contact = new Contact(newContactName,newContactNumber.toString());
                contacts.add(contact.getName());
                phoneNumbers.add(contact.getPhoneNumber());
                contactMap.put(contact.getName(),contact.getPhoneNumber());
                landingPage();

            case 3:
                System.out.println("Kindly input the name of the contact you would like to get : \n");
                String contactToSearch = scanner.next();
                Integer indexSearch = contacts.indexOf(contactToSearch);
                System.out.println("Name : "+contacts.get(indexSearch)+".\n"+"PhoneNumber : "+phoneNumbers.get(indexSearch));
                landingPage();

            case 4:
                System.out.println("Which contact would you like to Remove  : \n");
                String contactToRemove = scanner.next();
                Integer indexDelete = contacts.indexOf(contactToRemove);
                contacts.remove(contactToRemove);
                String contactsNumber= phoneNumbers.get(indexDelete);
                phoneNumbers.remove(contactsNumber);
                contactMap.remove(contactToRemove);
                System.out.println(contacts+"\n\n");
                System.out.println(phoneNumbers+"\n\n");
                System.out.println(contactMap);

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

                for(int i=0; i<messages.size(); i++) {
                    System.out.println(".  Message"+messages.get(i)+"PhoneNumber : "+receiverPhoneNumbers.get(i));
                }
                landingPage();

                break;
            case 2:
                System.out.println("Kindly input the message you would like to send : \n");
                String text = scanner.next().replaceAll("\\s","");

                Contact.setMessage(text);
                messages.add(Contact.getMessage());
                System.out.println("Kindly input the contact you would like to send to : \n");
                Integer receiverPhoneNumber = scanner.nextInt();
                receiverPhoneNumbers.add(receiverPhoneNumber);
                landingPage();

           break;

            case 3:
                landingPage();
            default:

        }}
        public static void manageContacts(){}
    }
}

