package com.java.in28minutes.functionalprogramming;

import java.util.List;

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        List.of(23, 43, 34, 45).stream()
                .filter(n -> n % 2 == 0)
                .forEach(e -> System.out.println(e));

    }
}
