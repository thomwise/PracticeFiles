package com.thomwise;

public class DeluxeBurger extends Hamburger {

    private String chips;
    private String drink;

    public DeluxeBurger(String breadRollType, String meat, String chips, String drink) {
        super(breadRollType, meat);
        this.chips = chips;
        this.drink = drink;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public double getBaseBurgerCost() {
        return 6.50;
    }
}
