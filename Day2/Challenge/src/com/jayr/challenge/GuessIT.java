package com.jayr.challenge;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class GuessIT {
    public static void main(String[] args) {


        /*
        Concept : Generate random number and ask user to guess it
        ask user to guess it until they receive the number
        after 5 times the game terminates "Game Over"

        //TODO:
        Show a welcome message
        --> Ask user their name and return "Hello Name_of_user"
        --> Ask if we cpould start the game
        --> after receiving  a positive answer generate a random number and a them to guess it
        --> if the guess is correct , show cobgradulations message then quit
        if incorrect ask to try again until he gets it,
        after the user guess anf its incorrect ask him to guess higher or lower depending on the random number generated
        if he fails 5 times --> show game over and quit
        * */

        System.out.println(" Welcome to a glimpse of the game of life...");
        System.out.println(" What is your name  ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+ name+" ! ! ");
        System.out.println(" Would you like to start ? (type Yes or No)");
        String decision = scanner.next();

        switch(decision.toLowerCase()){
          case "yes":
              StartGame();
              break;
          default:
               System.out.println("Thank you and have a nice time..\nBye.");
        }


    }
    public static void StartGame(){
        Random random =  new Random();
        int randomNumber = random.nextInt(20)+1;
        for (int i=0; i<5; i++){
        System.out.println((i+1)+" :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly guess a number between 0 and 21 ... ");
        Integer guess = scanner.nextInt();

            if (i == 4){
                System.out.println("\nGame Over !!");
                System.out.println("Would you like to try again? (type Yes or No) ");
                String decision = scanner.next();

                switch(decision.toLowerCase()){
                    case "yes":
                        StartGame();
                        break;
                    default:
                        System.out.println("Thank you and have a nice time..\nBye.");
                }
            }
        if(guess != randomNumber && guess<21){
            if (guess>randomNumber){
                System.out.println("Guess Higher than your guess : "+guess);
            }
        }else if (guess<randomNumber  && guess<21){
            System.out.println("Guess Lower than your guess : "+guess);
        }

        else if (guess>20){
                System.out.println("Must be less than 21 , your input is  : "+guess);
            StartGame();
            }
        else if (guess == randomNumber) {
            System.out.println("Congradulations U wonn!!!!!!");
            break;
        }
        break;
        }
    }
}
