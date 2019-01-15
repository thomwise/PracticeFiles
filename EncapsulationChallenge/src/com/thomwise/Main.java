package com.thomwise;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("HP", 90, 3, false);

        printer.fillToner();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();

    }
}
