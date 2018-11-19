package com.thomwise;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1041401));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int initialNumber = number;

        while(number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
            continue;
        }

        if(initialNumber == reverse) {
            return true;
        } return false;
    }

}