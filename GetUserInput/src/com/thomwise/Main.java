package com.thomwise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your birth year:");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {

            int birthYear = scanner.nextInt();
            int yearsOld = 2018-birthYear;

            if(yearsOld >= 0 && yearsOld <= 120) {

                System.out.println("You are " + yearsOld + " years old.");

            } else {
                System.out.println("Invalid year entered.");
            }
            System.out.println("Your name is " + name + ".");

        } else {
            System.out.println("Cannot parse year of birth.");
        }

        scanner.close();

    }
}
