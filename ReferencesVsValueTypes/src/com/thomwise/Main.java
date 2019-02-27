package com.thomwise;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myInteger = 10;
	    int anotherInteger = myInteger;

        System.out.println("myInteger = " + myInteger);
        System.out.println("anotherInteger = " + anotherInteger);

        anotherInteger++;

        System.out.println("myInteger = " + myInteger);
        System.out.println("anotherInteger = " + anotherInteger);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        anotherArray = new int[] {6, 5, 4, 3, 2};

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
    }
}
