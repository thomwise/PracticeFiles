package com.thomwise;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//	    while(count != 7) {
//            System.out.println("Count is equal to " + count);
//            count++;
//        }
//
//        System.out.println("***********");
//
//        for(int i = 1; i < 100; i++){
//            System.out.println("Count is equal to " + i);
//        }
//
//        count = 6;
//        do{
//            count++;
//            System.out.println("Count is equal to " + count);
//            if(count == 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {

            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            evenNumbersFound++;
            System.out.println("Even number found: " + number);

            if(evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found: " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {

        if((number % 2) == 0) {
            return true;
        } else return false;

    }
}
