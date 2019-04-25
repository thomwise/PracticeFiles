package com.thomwise;

public class Main {

    public static void main(String[] args) {

        String numberAsAString = "2018";
        int number = Integer.parseInt(numberAsAString);

        System.out.println("numberAsAString = " + numberAsAString);
        System.out.println("number = " + number);

        numberAsAString += 1;
        number += 1;

        System.out.println(numberAsAString);
        System.out.println(number);

    }
}
