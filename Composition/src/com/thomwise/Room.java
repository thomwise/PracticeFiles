package com.thomwise;

public class Room {

    private Lights theLights;
    private Windows theWindows;
    private Furniture theFurniture;

    public Room(Lights theLights, Windows theWindows, Furniture theFurniture) {
        this.theLights = theLights;
        this.theWindows = theWindows;
        this.theFurniture = theFurniture;
    }

    public void turnLightsOn() {
        theLights.turnLightOn();
    }
}
