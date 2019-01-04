package com.thomwise;

public class Couch {

    private String material;
    private String brand;
    private Dimensions dimensions;
    private String color;

    public Couch(String material, String brand, Dimensions dimensions, String color) {
        this.material = material;
        this.brand = brand;
        this.dimensions = dimensions;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
