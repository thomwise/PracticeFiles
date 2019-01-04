package com.thomwise;

public class Table {

    private String material;
    private boolean isDecor;
    private boolean hasDrawers;
    private boolean hasLeaf;
    private Dimensions dimensions;

    public Table(String material, boolean isDecor, boolean hasDrawers, boolean hasLeaf, Dimensions dimensions) {
        this.material = material;
        this.isDecor = isDecor;
        this.hasDrawers = hasDrawers;
        this.hasLeaf = hasLeaf;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isDecor() {
        return isDecor;
    }

    public boolean isHasDrawers() {
        return hasDrawers;
    }

    public boolean isHasLeaf() {
        return hasLeaf;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
