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

    public int printPage(int pages) {
        int pagesToPrint = pages;

        if(this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("This printer is a duplex printer.");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
