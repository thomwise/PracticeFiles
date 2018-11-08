package com.thomwise;

public class Main {

    public static void main(String[] args) {

        byte bestByte = 7;
        short bestShort = 777;
        int bestInt = 77_777;
        long bestLong = 50_000 + 10*(bestByte + bestShort + bestInt);

        System.out.println(bestLong);

        /*
        //int has a width of 32
        int myMinNumber = -2_147_483_648;
        int myMaxNumber = 2_147_483_647;

        int myTotal = (myMinNumber/2);

        System.out.println(myTotal);

        //byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        byte myNewByteValue = (byte) (maxByte/2);

        System.out.println(myNewByteValue);

        //short has a width of 16
        short minShort = -32768;
        short maxShort = 32767;

        //long has a width of 64
        long myLong = 100L;
        */
    }
}
