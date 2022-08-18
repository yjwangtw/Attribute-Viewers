package com.attributeviewers.viewers.rightbar;

import java.util.LinkedList;
import java.util.List;

public class RightbarFrame {
    List<OptionFrame> optionFrames = new LinkedList<>();
    public static RightbarFrame of() {
        return new RightbarFrame();
    }

    public RightbarFrame toggle(String property, String displayName, Boolean defaultValue) {
        optionFrames.add(new ToggleOptionFrame(property, displayName, defaultValue));
        return this;
    }

    public RightbarFrame spinner(String property, String displayName, Integer min, Integer max, Integer stage) {
        optionFrames.add(new SpinnerOptionFrame(property, displayName, min, max, stage));
        return this;
    }
}