package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/23/2021 , 
    CREATED ON : 5:57 PM
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, bodyType);
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, bodyType);

        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225, bodyType);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter", 4332, bodyType);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Ganymede", 7.1, bodyType);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Io", 1.8, bodyType);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7, bodyType);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5, bodyType);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Deimos", 1.3, bodyType);
        solarSystem.put(temp.getName(), tempMoon);
        planets.add(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3, bodyType);
        solarSystem.put(temp.getName(), tempMoon);
        planets.add(tempMoon);



        temp = new HeavenlyBody("Saturn", 10759, bodyType);
        solarSystem.put(tempMoon.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660, bodyType);
        solarSystem.put(tempMoon.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165, bodyType);
        solarSystem.put(tempMoon.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248, bodyType);
        solarSystem.put(tempMoon.getName(), temp);
        planets.add(temp);

        displayPlanets(planets);

        System.out.println("==================================================================");

        HeavenlyBody jupiter = solarSystem.get("Jupiter");

        displayMoon(jupiter);

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842, bodyType);
        planets.add(pluto);

        for (HeavenlyBody planet: planets) {
            System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
        }

        Object object = new Object();
        object.equals(object);
        "pluto".equals("");
    }

    public static void displayPlanets(Set<HeavenlyBody> planets){
        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }
    }

    public static void displayMoon(HeavenlyBody heavenlyBody) {
        System.out.println("Moons of " +heavenlyBody.getName());
        for (HeavenlyBody body: heavenlyBody.getSatellites()) {
            System.out.println("\t" + body.getName());
        }
    }
}
