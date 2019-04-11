package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DoubleEvenNums {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1,2,3,4,5);

        List<Integer> doubleEven = numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .collect(Collectors.toList());

        doubleEven.forEach(System.out::println);

        Set<Integer> doubleEven1 = numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .collect(Collectors.toSet());

        doubleEven1.forEach(System.out::println);
    }
}
