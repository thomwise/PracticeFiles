package com.thomwise;

public class Lights {

    private boolean isSwitchOn;
    private int numberOfLights;
    private int numberOfBurnedOut;
    private int lumens;

    public Lights(boolean isSwitchOn, int numberOfLights, int numberOfBurnedOut, int lumens) {
        this.isSwitchOn = isSwitchOn;
        this.numberOfLights = numberOfLights;
        this.numberOfBurnedOut = numberOfBurnedOut;
        this.lumens = lumens;
    }

    public void turnLightOn() {
        if(isSwitchOn) {
            System.out.println("Light is on!");
        }
    }

    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public int getNumberOfBurnedOut() {
        return numberOfBurnedOut;
    }

    public int getLumens() {
        return lumens;
    }
}
