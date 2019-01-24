package com.thomwise;

public class Car extends Vehicle {

    private String transmission;
    private int topSpeed;
    private int numberOfDoors;

    private int currentGear;


    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    public Car(String steering, int moving, String transmission, int topSpeed, int numberOfDoors) {
        super(steering, 5, moving);
        this.transmission = transmission;
        this.topSpeed = topSpeed;
        this.numberOfDoors = numberOfDoors;

        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        
    }

    public String getTransmission() {
        return transmission;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
