package com.attributeviewers.viewers.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
public @interface Arg {
    String value();
}
