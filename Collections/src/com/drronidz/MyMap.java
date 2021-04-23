package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/23/2021 , 
    CREATED ON : 3:24 PM
*/

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("JavaScript", "Web & high-level programming language, object-oriented");
        languages.put("XML","extended mobilisation language");

        //System.out.println(languages.get("Java"));
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));

        System.out.println("================================================================");

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        languages.remove("Python");

        if(languages.remove("JavaScript", "Cross-platform & high-level programming language, object-oriented")) {
            System.out.println("JavaScript removed ");
        }else {
            System.out.println("JavaScript not removed, key/value pair not found");
        }

        System.out.println(languages.replace("XML","snippet language used to describe information"));

        if(languages.replace("XML","snippet language used to describe information","snippet language used to describe information")){
            System.out.println("XML replaced");
        } else {
            System.out.println("XML was not replaced");
        }

        System.out.println(languages.replace("Ruby"," Ruby on rails a new languages & few community"));
    }
}
