package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/30/2021 , 
    CREATED ON : 2:15 PM
*/

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
