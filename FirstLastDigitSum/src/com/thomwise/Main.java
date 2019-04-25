package com.thomwise;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(28543));
    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = 0;

            while(number > 0) {
                firstDigit = number % 10;
                number = number / 10;
            }

            return firstDigit + lastDigit;
        }

    }

}
