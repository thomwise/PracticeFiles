package com.thomwise;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);


        System.out.println("Minimum value is " + findMin(returnedArray));



    }
    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " values.\r");
        int[] values = new int[count];

        for(int i=0; i<values.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            values[i] = number;
        }
        return values;
    }
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

}
