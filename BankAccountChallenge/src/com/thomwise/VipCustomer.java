package com.thomwise;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    //Method Section
    public VipCustomer() {
        this("Fred", 5000.0, "fred@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "feisty@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //Getters Section
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
