package com.thomwise;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else
            System.out.println("Was not 1 or 2");

        int switchValue = 5;
        switch(switchValue) {
            case 1:
                System.out.println("Value was " + switchValue);
                break;

            case 2:
                System.out.println("Value was " + switchValue);
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1-5");
        }

        char charValue = 'E';
        switch(charValue) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was " + charValue);
                break;

            default:
                System.out.println("Value was not A, B, C, D or E");
                break;

        }


    }
}
