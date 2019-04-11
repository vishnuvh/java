package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {

    //strategy pattern

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(totalValues(numbers,e->true));
        System.out.println(totalValues(numbers,e->e%2==0));
        System.out.println(totalValues(numbers,e->e%2!=0));

        System.out.println(totalValues1(numbers,e->true));
        System.out.println(totalValues1(numbers,e->e%2==0));
        System.out.println(totalValues1(numbers,e->e%2!=0));

    }

    private static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        int result = 0;
        for (int e:numbers){
            if (selector.test(e))
                result+=e;
        }
       return result;
    }

    private static int totalValues1(List<Integer> numbers, Predicate<Integer> selector) {

        return numbers.stream().
                filter(selector).
                reduce(0,Integer::sum);
    }
}
