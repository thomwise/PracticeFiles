package com.thomwise;

public class FordTransit extends Car{

    private String trim;
    private String wheelBase;
    private boolean extendedCab;

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    public FordTransit(String steering, int moving, String transmission, int topSpeed, int numberOfDoors, String trim, String wheelBase, boolean extendedCab) {
        super(steering, moving, transmission, topSpeed, numberOfDoors);
        this.trim = trim;
        this.wheelBase = wheelBase;
        this.extendedCab = extendedCab;
    }

    public String getTrim() {
        return trim;
    }

    public String getWheelBase() {
        return wheelBase;
    }

    public boolean isExtendedCab() {
        return extendedCab;
    }
}
