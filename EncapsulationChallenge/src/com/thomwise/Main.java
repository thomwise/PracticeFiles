package com.thomwise;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("HP", 90, true);

        printer.addToner(40);
        printer.printPage(3);
        printer.printPage(3);
        printer.printPage(5);
        printer.printPage(4);
        printer.printPage(1);

        System.out.println("Initial page count = " + printer.getNumberOfPages());
        int pagesPrinted = printer.printPage(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPages());
    }
}
