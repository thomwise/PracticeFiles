package com.thomwise;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Engine is running.";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " is speeding up.";
    }

    public String brake() {
        return "Vehicle is slowing down.";
    }
}

class Lotus extends Car {

    public Lotus() {
        super(4, "Lotus");
    }

    @Override
    public String startEngine() {
        return "Four cylinder engine roars to life!";
    }

    @Override
    public String accelerate() {
        return "Vehicle quickly reaches terminal velocity.";
    }

}

class RamPromaster extends Car {
    public RamPromaster() {
        super(6, "Ram Promaster");
    }

    @Override
    public String startEngine() {
        return "Four cylinder engine turns on.";
    }

    @Override
    public String brake() {
        return "Vehicle squeaks whilst slowing down.";
    }
}

class Element extends Car {
    public Element() {
        super(4, "Element");
    }

    @Override
    public String startEngine() {
        return "Four cylinder engine sputters on.";
    }

    @Override
    public String brake() {
        return "At least the shocks work...";
    }
}

class Pinto extends Car {
    public Pinto() {
        super(3, "Pinto");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n" +
                    "Turning the key: " + car.startEngine() + "\n" +
                    "Accelerating: " + car.accelerate() + "\n" +
                    "Braking: " + car.brake() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) + (Math.random() * 4 + 1);
        System.out.println("The random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Lotus();

            case 2:
                return new RamPromaster();

            case 3:
                return new Element();

            case 4:
                return new Pinto();
        }
        return null;
    }
}














