package com.thomwise;

public class Printer {

    private String brand;
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(String model, int tonerLevel, boolean isDuplex) {
        this.brand = model;

        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public void printPage() {
        this.numberOfPages = this.numberOfPages + 1;
        int printedPages = this.numberOfPages;
        System.out.println(printedPages + " pages printed.");

        if(isDuplex) {
            System.out.println("This printer is a duplex printer.");
        } else {
            System.out.println("This is not a duplex printer.");
        }

    }
}
