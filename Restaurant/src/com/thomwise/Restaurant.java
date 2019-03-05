package com.thomwise;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Restaurant {
    private String name;
    private String address;
    private String category;
    private char healthCodeLetter;
    private int numOfRatings;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public char getHealthCodeLetter() {
        return healthCodeLetter;
    }

    public void setHealthCodeLetter(char healthCodeLetter) {
        this.healthCodeLetter = healthCodeLetter;
    }

    public void display() {
        System.out.println("===============================\n" +
                name + "\n" +
                "===============================\n" +
                "Category: " + category + "\n" +
                "Address: " + address + "\n" +
                "Health Rating: " + healthCodeLetter + "\n" +
                "Rating: " + rating + "\n" +
                "===============================\n");
    }

    public void rate(int score) {
        rating = ((rating * numOfRatings) + score) / (numOfRatings + 1);
        numOfRatings++;
    }

    public Restaurant(String name, String category, String address, char healthCodeLetter) {
        this.name = name;
        this.category = category;
        this.address = address;
        this.healthCodeLetter = healthCodeLetter;
        this.rating = 0;
        this.numOfRatings = 0;
    }

    public Restaurant(String name, String address) {
        this(name, "Unknown", address, 'A');
    }

    public Restaurant(String name) {
        this(name, "Fresno, CA");
    }

    public void save() throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("data.txt");
    }

}
