package com.thomwise;

public class HealthyBurger extends Hamburger {

    private String veggiePatty;
    private String brownRyeRoll;

    public HealthyBurger(String breadRollType, String meat, String veggiePatty) {
        super(breadRollType, meat);
        this.veggiePatty = veggiePatty;
        this.brownRyeRoll = "Brown Rye Roll";
    }
}
