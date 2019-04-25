package com.thomwise;

public class HealthyBurger extends Hamburger {

    private String veggiePatty;
    private String brownRyeRoll;
    private boolean avocado;
    private boolean sweetPotato;
    private double totalBurgerCost;


    public HealthyBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.avocado = false;
        this.sweetPotato = false;
        this.veggiePatty = "Veggie Patty";
        this.brownRyeRoll = "Brown Rye Roll";
        this.totalBurgerCost = 6.00;
    }

    public double addAvocado() {
        this.avocado = true;
        if(this.avocado) {
            double avocado = 1.25;
            totalBurgerCost += avocado;
        }
        return totalBurgerCost;
    }

    public double addSweetPotato() {
        this.sweetPotato = true;
        if(this.sweetPotato) {
            double sweetPotato = .85;
            totalBurgerCost += sweetPotato;
        }
        return totalBurgerCost;
    }

    @Override
    public double getTotalBurgerCost() {
        return totalBurgerCost;
    }

    @Override
    public double getBaseBurgerCost() {
        return 6.00;
    }

    @Override
    public String getBreadRollType() {
        return this.brownRyeRoll;
    }

    @Override
    public String getMeat() {
        return this.veggiePatty;
    }
}
