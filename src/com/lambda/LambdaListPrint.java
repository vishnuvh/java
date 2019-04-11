package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaListPrint {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        for (int e : numbers){
            System.out.println(e);
        }

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        numbers.forEach(integer -> System.out.println(integer));

        numbers.forEach(System.out::println);

    }
}
