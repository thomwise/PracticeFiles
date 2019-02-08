package com.thomwise;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "beef", 3.56, "french");

        DecimalFormat moneyFormat = new DecimalFormat("$0.00");

        double price = hamburger.itemizedHamburger();

        hamburger.addHamburgerAddition1("Tomato", .27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        System.out.println("Total Burger price is " + moneyFormat.format(hamburger.itemizedHamburger()));

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizedHamburger();
        System.out.println("Total Healthy Burger price is " + moneyFormat.format(healthyBurger.itemizedHamburger()));

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Should not do this", 50.53);
        System.out.println("Total Healthy Burger price is " + moneyFormat.format(deluxeBurger.itemizedHamburger()));

    }
}
