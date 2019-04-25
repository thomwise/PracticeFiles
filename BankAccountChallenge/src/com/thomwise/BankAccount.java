package com.thomwise;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructor Practice
    public BankAccount() {
        this("12345", 0.0, "John Doe", "johndoe@email.com",
                "123-555-5555");
        System.out.println("This is an empty constructor.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Method for Deposit
    public void deposit(double depositAmount) {
        if(depositAmount < 0 ) {
            System.out.println("Cannot deposit a negative amount.");
        } else {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + ". New account balance is " + this.balance);
        }
    }

    //Method for Withdrawal
    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Cannot withdraw, there is " + this.balance + " left in your account.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have " + this.balance + " left in your account.");
        }
    }

    //Setter and Getter Section ******************************
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
         return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}


