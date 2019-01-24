package com.thomwise;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the number is " + sumDigits(69290));

    }

    public static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
//              Extract the least significant digit
            int digit = number % 10;
            sum += digit;


//              Drop the least significant digit
            number /= 10;

        }

        return sum;
    }

}
