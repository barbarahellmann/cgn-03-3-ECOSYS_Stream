package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Liste der Elemente
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Cucumber", "Raspberry", "Strawberry", "Kiwi");

        System.out.println("Loop: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // Ausgabe als Stream

        System.out.println("Stream");
        fruits.stream()
                .forEach((fruit) -> {
                    System.out.println(fruit);
        });

        fruits.stream()
                .map ((f) -> {
                    return f.length();   // gibt die Länge der Elemente für jedes Element zurück
                })
                .forEach(length -> {
                    System.out.println(length); // druckt alle Elemente aus
        });

        List<String> result = fruits.stream()
                .filter(f -> f.length() > 5 && f.length() < 10)
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(fruits);
        System.out.println(result);
    }
}
