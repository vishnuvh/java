package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaListMisc {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4,6, 7, 8, 9, 10);

        //given ordered list find double of first even number greater than 3

        int result =0;

        for (Integer e: numbers){
            if (e>3 && e%2==0){
                result = e*2;
                break;
            }
        }

        System.out.println(result);


        System.out.println(numbers
                            .stream()
                            .filter(e->e>3)
                            .filter(e->e%2==0)
                            .map(e->e*2)
                            .findFirst());

        Stream.iterate(100,e->e+1);

    }
}
