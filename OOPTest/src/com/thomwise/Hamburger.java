package com.thomwise;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private boolean tomatoes;
    private boolean onions;
    private boolean lettuce;
    private boolean secretSauce;
    public double baseBurgerCost;
    private double totalBurgerCost;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.tomatoes = false;
        this.onions = false;
        this.lettuce = false;
        this.secretSauce = false;
        this.baseBurgerCost = 5.00;
        this.totalBurgerCost = this.baseBurgerCost;
    }

    public double getBaseBurgerCost() {
        return baseBurgerCost;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getTotalBurgerCost() {
        return totalBurgerCost;
    }

    public double addOnions() {
        this.onions = true;
        if(this.onions) {
            double onions = .35;
            totalBurgerCost += onions;
        }
        return totalBurgerCost;
    }

    public double addSecretSauce() {
        this.secretSauce = true;
        if(this.secretSauce) {
            double secretSauce = .60;
            totalBurgerCost += secretSauce;
        }
        return totalBurgerCost;
    }

    public double addTomatoes(){
        this.tomatoes = true;
        if(this.tomatoes) {
            double tomatoes = .40;
            totalBurgerCost += tomatoes;
        }
        return totalBurgerCost;
    }

    public double addLettuce() {
        this.lettuce = true;
        if(this.lettuce) {
            double lettuce = .50;
            totalBurgerCost += lettuce;
        }
        return totalBurgerCost;
    }
}
