package com.attributeviewers.viewers.rightbar;

public class SpinnerOptionFrame implements OptionFrame{
    public String property;
    public String displayName;
    public Integer min;
    public Integer max;
    public Integer stage;


    public SpinnerOptionFrame(String property, String displayName, Integer min, Integer max, Integer stage) {
        this.property = property;
        this.displayName = displayName;
        this.min = min;
        this.max = max;
        this.stage = stage;
    }
}
