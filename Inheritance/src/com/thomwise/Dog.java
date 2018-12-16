package com.thomwise;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        chew();
        System.out.println("dog.eat() called");
        super.eat();
    }
}
