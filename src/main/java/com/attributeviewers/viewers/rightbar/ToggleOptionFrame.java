package com.attributeviewers.viewers.rightbar;

public class ToggleOptionFrame implements OptionFrame{
    public String property;
    public String displayName;
    public Boolean defaultValue = false;

    public ToggleOptionFrame(String property, String displayName, Boolean defaultValue) {
        this.property = property;
        this.displayName = displayName;
        this.defaultValue = defaultValue;
    }
}
