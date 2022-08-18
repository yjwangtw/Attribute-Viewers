package com.attributeviewers.viewers.viewer.locationsviewer;

public enum LocationStatus {
    OPEN("Open"), TEMPCLOSED("Temporarily Closed"), PERMCLOSE("Permanently Closed");

    String displayName;
    LocationStatus(String displayName) {
        this.displayName = displayName;
    }
}
