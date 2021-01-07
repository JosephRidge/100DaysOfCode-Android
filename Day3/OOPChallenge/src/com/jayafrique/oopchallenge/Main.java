package com.jayafrique.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoctorDiagnosis(scanner);



    }
    public static void DoctorDiagnosis( Scanner scanner){
        Patient patient = new Patient();
        patient.setName("Paul");
        patient.setAge(15);
        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());
        System.out.println("Choose an Organ:");
        System.out.println("\t1. Left Eye");
        System.out.println("\t2. Right Eye");
        System.out.println("\t3. Heart");
        System.out.println("\t4. Stomach");
        System.out.println("\t5. Skin");
        System.out.println("\t6. Quit");
        MakeAChoice(scanner);

    }

    public static void MakeAChoice(Scanner scanner){
        Integer choice = scanner.nextInt();
        while(choice != 6){
            if(choice ==1 ){
                Eye eye = new Eye("Left Eye","Short sighted","Blue");
                System.out.println("Name: "+eye.Name);
                System.out.println("Medical Condition: "+eye.MedicalCondition);
                System.out.println("Color: "+eye.Behavior);
                System.out.println("\n1 . Close the Eye.");
                System.out.println("2 . Select another Option.\n");
                System.out.println("Select either 1 or 2");
                Integer SecondChoice = scanner.nextInt();
                if(SecondChoice == 1){
                    System.out.println("Left Eye Closed.\n");
                    DoctorDiagnosis(scanner);
                }else if(SecondChoice ==2 ){
                    DoctorDiagnosis(scanner);
                    break;
                }

            }else if(choice == 2){
                Eye eye = new Eye("Right Eye","Normal","Blue");
                System.out.println("Name: "+eye.Name);
                System.out.println("Medical Condition: "+eye.MedicalCondition);
                System.out.println("Color: "+eye.Behavior);
                System.out.println("\n1 . Close the Eye.");
                System.out.println("2 . Select another Option.\n");
                System.out.println("Select either 1 or 2");
                Integer SecondChoice = scanner.nextInt();
                if(SecondChoice == 1){
                    System.out.println("1 . Close the Eye.\n");
                    DoctorDiagnosis(scanner);
                }else if(SecondChoice ==2 ){
                    DoctorDiagnosis(scanner);
                }

            }else if(choice == 3){
//                Heart heart = new Heart();

            }else if(choice == 4){

            }else if(choice == 5){

            }else{
                System.out.println("Kindly pick a choice using the number.");
                break;
            }

        }
    }
}
