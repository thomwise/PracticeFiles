package com.thomwise;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";

        System.out.println("myString reads: " + myString);

        myString = myString + " and this is more.";
        System.out.println("myString reads: " + myString);

        myString = myString + " \u00A92018";
        System.out.println("myString now reads: " + myString);

        String lastString = "10";
        int myInt = 250;
        lastString = lastString + myInt;

        System.out.println(lastString);

        double myDouble = 4698.0903;
        lastString = lastString + myDouble;
        System.out.println(lastString);

        //A String is a class that can be used as a primitive type


    }
}
