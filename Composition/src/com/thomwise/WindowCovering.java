package com.thomwise;

public class WindowCovering {

    private boolean hasBlinds;
    private boolean hasCurtains;

    public WindowCovering(boolean hasBlinds, boolean hasCurtains) {
        this.hasBlinds = hasBlinds;
        this.hasCurtains = hasCurtains;
    }

    public boolean isHasBlinds() {
        return hasBlinds;
    }

    public boolean isHasCurtains() {
        return hasCurtains;
    }
}
