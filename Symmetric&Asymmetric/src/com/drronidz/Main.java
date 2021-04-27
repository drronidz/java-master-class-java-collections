package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/27/2021 , 
    CREATED ON : 7:01 PM
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i<= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        System.out.println("#####################################################");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        for(int i : union) {
            System.out.println(i + "is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        System.out.println("#####################################################");
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        for(int i : intersection) {
            System.out.println(i + "is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        System.out.println("#####################################################");

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s: words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String > divine = new HashSet<>();
        String [] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String [] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));


    }
}