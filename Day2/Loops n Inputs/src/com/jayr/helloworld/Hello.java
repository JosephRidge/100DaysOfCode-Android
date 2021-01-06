package com.jayr.helloworld;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;


public class Hello {
//psvm
    public static void main(String[] args) {
//        System.out.println("Hollwo World");
//        System.out.print("Hello World");
        //Loops:
/*
for loop
do {} while();
while(){}
* * */
//     getting user input plus generating a random number Random number
     System.out.println("Please enter a number : ");
     Scanner scanner = new Scanner(System.in);
     int answer = scanner.nextInt();
     System.out.println("Anser was : "+answer);
     System.out.println("Enter your name: ");
     String name = scanner.next();
     System.out.println("Hello "+name+" !!");

    }
}
