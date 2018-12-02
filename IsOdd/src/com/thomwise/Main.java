package com.thomwise;

public class Main {

    public static void main(String[] args) {


        int number = 0;
        int finishNumber = 15;

        while(number <= finishNumber){
            number++;

            if(number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("Number = " + number);

            if(number == 10) {
                break;
            }
        }

    }

//    public static boolean isOdd(int number) {
//        if(number > 0 && (number % 2 != 0)) {
//            return true;
//        } else return false;
//    }
//
//
//    public static int sumOdd(int start, int end) {
//
//        int sum = 0;
//
//        if(start > 0 && start <= end) {
//            for(int i = start; i <= end; i++) {
//                if(isOdd(i)) {
//                    sum += i;
//                }
//            }
//            return sum;
//        }
//        return -1;
//    }
    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
