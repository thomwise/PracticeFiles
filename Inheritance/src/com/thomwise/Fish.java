package com.thomwise;

public class Fish extends Animal{

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void rest() {

    }

    public void moveMuscles() {

    }

    public void moveBackFin() {

    }

    public void swim(int speed) {
        moveBackFin();
        moveMuscles();

        super.move(speed);
    }

    public int getGills() {
        return gills;
    }

    public int getFins() {
        return fins;
    }

    public int getEyes() {
        return eyes;
    }
}
