package com.java.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        /*umbers.stream()
                .forEach(element -> System.out.println(element));*/
        //                                 StartingValue, cada par de numeros como los va a tratar
        int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

        int sumOddNumbers = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
        System.out.println(sumOddNumbers);
        System.out.println("fpSum: \n" + fpSum(numbers));
    }

    private static int fpSum(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,
                        (number1,number2) -> {
                    //cuerpo de la lambda
                            System.out.println(String .format("%d %d", number1,number2));
                            return number1 + number2;
                        });
    }
}
