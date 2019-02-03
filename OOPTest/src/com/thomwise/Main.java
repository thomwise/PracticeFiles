package com.thomwise;


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("French Roll", "Beef");


        System.out.println("Hamburger price is $" + hamburger.getTotalBurgerCost());
        hamburger.addLettuce();
        System.out.println("Hamburger price is $" + hamburger.getTotalBurgerCost());
        hamburger.addTomatoes();
        System.out.println("Hamburger price is $" + hamburger.getTotalBurgerCost());
        hamburger.addSecretSauce();
        System.out.println("Hamburger price is $" + hamburger.getTotalBurgerCost());
        hamburger.addOnions();
        System.out.println("Hamburger price is $" + hamburger.getTotalBurgerCost());
        System.out.println("Hamburger has a " + hamburger.getBreadRollType() + " bun with a " + hamburger.getMeat() + " patty.");



    }
}
