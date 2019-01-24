package com.thomwise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        BankAccount bobsAccount = new BankAccount("3253", 100.0, "John Micah",
//                "poop@sbcglobal.net", "707-319-5914");
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
        VipCustomer fredsAccount = new VipCustomer("Freddy G",7500);

        System.out.println(fredsAccount.getName());
        System.out.println(fredsAccount.getCreditLimit());
        System.out.println(fredsAccount.getEmail());

    }
}
