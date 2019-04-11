package com.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaListEvenSum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = 0;

        for (Integer e :numbers){
            if (e%2 == 0){
                result+= e*2;
            }
        }
        System.out.println(result);

        System.out.println(numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .reduce(0,Integer::sum)
        );

        System.out.println(numbers.stream()
                                .filter(e->e%2==0)
                                .mapToInt(e->e*2)
                                .sum()
        );

        // Stream<T> filter takes Predicate<T>
        // Stream<T> map takes Function<T,R> to return Stream<R>
        //Stream<T> reduce takes 2 parameters
                //first parameter type T
                // type BiFunction<R,T,R> and returns R
        // sum is also reduce operation

    }

}
