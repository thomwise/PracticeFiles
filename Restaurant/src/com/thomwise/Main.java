package com.thomwise;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Restaurant a = new Restaurant("Me-N-Ed's", "Pizza", "123 N. Blackstone Ave.",
                'B');

        Restaurant b = new Restaurant("Heirloom", "Hipster", "246 E. Friant Rd.", 'A');

    private Restaurant restaurant = new Restaurant("The Habit", "123 Shaw Ave");

        a.rate(8);
        a.rate(7);
        a.rate(7);
        b.rate(9);
        b.rate(10);
        a.display();
        b.display();

    }
}
