package com.thomwise;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie", 12, 8, 2, 1, 1, 20,"Long Silky");

        dog.eat();

    }
}
