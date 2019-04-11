package com.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaListSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream()
                                    .reduce(0,(total,e)->Integer.sum(total,e)));

        System.out.println(numbers.stream()
                .reduce(0,Integer::sum));

        System.out.println(numbers.stream().
                                map(e -> String.valueOf(e))
                                .reduce("",(carry,e)->carry.concat(e)));

        System.out.println(numbers.stream()
                                .map(String::valueOf)
                                .reduce("",String::concat));


    }
}
