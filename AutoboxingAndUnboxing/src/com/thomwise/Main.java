package com.thomwise;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	    Integer integer = new Integer(54);
//	    Double myDouble = new Double(12.25);
//        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
////        for(int i=0; i<=10; i++) {
////            myIntArrayList.add(Integer.valueOf(i));
////        }
////
////        for(int i=0; i<=10; i++) {
////            System.out.println(i + " ---> " + myIntArrayList.get(i).intValue());
////        }
//
//        Integer myValue = 56; // Integer.valueOf(56);
//        int myInt = myValue; // myValue.intValue();
//
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//        for(Double dbl=0.0; dbl<=10.0; dbl += 0.5) {
//            myDoubleValues.add(dbl);
//        }
//
//        for(int i=0; i<myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i);
//            System.out.println(i + " ---> " + value);
//        }

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Thom", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Andrew", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Thom", 44.22);
        bank.addCustomerTransaction("Adelaide", "Thom", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);
    }
}
