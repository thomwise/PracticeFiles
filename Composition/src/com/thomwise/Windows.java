package com.thomwise;

public class Windows {

    private int numberOfWindows;
    private boolean isOpen;
    private WindowCovering windowCovering;
    private Dimensions dimensions;
    private boolean isDoublePaned;

    public Windows(int numberOfWindows, boolean isOpen, WindowCovering windowCovering, Dimensions dimensions, boolean isDoublePaned) {
        this.numberOfWindows = numberOfWindows;
        this.isOpen = isOpen;
        this.windowCovering = windowCovering;
        this.dimensions = dimensions;
        this.isDoublePaned = isDoublePaned;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public WindowCovering getWindowCovering() {
        return windowCovering;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isDoublePaned() {
        return isDoublePaned;
    }
}
