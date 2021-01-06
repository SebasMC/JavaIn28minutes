package com.java.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printWithFP(list);
        printBasicWithFiltering(list);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.forEach(System.out::println);
    }

    private static void printBasicWithFiltering(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at"))
                System.out.println(string);
        }
    }

    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter( //Condicional
                        element -> element.endsWith("at")
                )
                .forEach(
                        element -> System.out.println(element));
    }
}
