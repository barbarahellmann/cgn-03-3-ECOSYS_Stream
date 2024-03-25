package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Cucumber", "Raspberry", "Strawberry", "Kiwi");

        System.out.println("Loop: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Stream");
        fruits.stream()
                .forEach((System.out::println));
    }
}