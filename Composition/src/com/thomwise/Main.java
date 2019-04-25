package com.thomwise;

public class Main {

    public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(5, 20, 20);
		Case theCase = new Case("220B", "Dell", "240", dimensions);

		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2200, 1600));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);

		thePC.powerUp();

		WindowCovering windowCovering = new WindowCovering(true, false);

		Table table = new Table("Wood", true, true, false, new Dimensions(24, 45, 36));

		Couch couch = new Couch("Leather", "Ikea", new Dimensions(44, 50, 23), "Brown");

		Lights theLights = new Lights(true, 3, 0, 1200);

		Windows theWindows = new Windows(7, false, windowCovering , new Dimensions(18, 30, 1), true);

		Furniture theFurniture = new Furniture(table, couch);

		Room theRoom = new Room(theLights, theWindows, theFurniture);

		theRoom.turnLightsOn();
	}
}
