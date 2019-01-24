package com.thomwise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {

            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);


//        System.out.println("Enter number #1: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//
//        if(hasNextInt) {
//
//            int count = 2;
//            int inputNumber = scanner.nextInt();
//            int sum = 0;
//            while(count <= 10) {
//                scanner.nextLine();
//                System.out.println("Enter number #" + count + ": ");
//                sum += inputNumber;
//                count++;
//            }
//            System.out.println("The total is " + sum);
//
//        } else {
//            System.out.println("Invalid Value");
//        }

        scanner.close();
    }
}
