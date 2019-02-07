package com.thomwise;


import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("French Roll", "Beef");
        HealthyBurger healthyBurger = new HealthyBurger("Dutch Crust", "N/A");
        DeluxeBurger deluxeBurger = new DeluxeBurger("Ciabatta", "Ostrich", "Doritos", "Dr. Pepper");

        DecimalFormat moneyFormat = new DecimalFormat("$0.00");

        System.out.println(moneyFormat.format(healthyBurger.getTotalBurgerCost()));

        healthyBurger.addAvocado();
        System.out.println("Healthy Burger price is " + moneyFormat.format(healthyBurger.getTotalBurgerCost()) + " with avocado.");
        healthyBurger.addSweetPotato();
        System.out.println("Healthy Burger price is " + moneyFormat.format(healthyBurger.getTotalBurgerCost()) + " with sweet potato.");
        System.out.println("Hamburger price is " + moneyFormat.format(hamburger.getTotalBurgerCost()));
        hamburger.addLettuce();
        System.out.println("Hamburger price is " + moneyFormat.format(hamburger.getTotalBurgerCost()));
        hamburger.addTomatoes();
        System.out.println("Hamburger price is " + moneyFormat.format(hamburger.getTotalBurgerCost()));
        hamburger.addSecretSauce();
        System.out.println("Hamburger price is " + moneyFormat.format(hamburger.getTotalBurgerCost()));
        hamburger.addOnions();
        System.out.println("Hamburger price is " + moneyFormat.format(hamburger.getTotalBurgerCost()));
        System.out.println("Hamburger has a " + hamburger.getBreadRollType() + " bun with a " + hamburger.getMeat() + " patty.");

        System.out.println("Healthy burger base price: " + moneyFormat.format(healthyBurger.getBaseBurgerCost()) + "\n" + "Deluxe burger base price: " + moneyFormat.format(deluxeBurger.getBaseBurgerCost()) + "\n" + "Hamburger base price: " + moneyFormat.format(hamburger.getBaseBurgerCost()));


    }
}
