package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/27/2021 , 
    CREATED ON : 6:42 PM
*/

import java.util.Objects;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;

        if(object instanceof Dog) {
            String objectName = ((Dog) object).getName();
            return this.name.equals(objectName);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
