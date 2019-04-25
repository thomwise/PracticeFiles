package com.thomwise;

public class Vehicle {

    private String steering;
    private int changingGears;
    private int moving;

    private int speed;
    private int direction;

    public Vehicle(String steering, int changingGears, int moving) {
        this.steering = steering;
        this.changingGears = changingGears;
        this.moving = moving;

        this.speed = 0;
        this.direction = 0;
    }

    public void move(int speed, int direction) {
        System.out.println("Vehicle.move() moving at " + speed + " in direction " + direction + ".");

    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer() steering at " + this.direction + " degrees.");
    }

    public String getSteering() {
        return steering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getMoving() {
        return moving;
    }
}
