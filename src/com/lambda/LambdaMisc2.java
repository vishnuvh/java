package com.lambda;

import java.util.stream.Stream;

public class LambdaMisc2 {

    //Given a number k and count n, find the total of doouble n even numbers starting with k
    //where square root of each number is greater than 20

    public static void main(String[] args) {

        int k = 121;
        int n = 51;

        System.out.println(compute(k,n));
        System.out.println(compute1(k,n));



    }

    static int compute1(int k,int n) {
        return Stream.iterate(k,e->e+1)
                    .filter(e->e%2==0)
                    .filter(e->Math.sqrt(e)>20)
                    .mapToInt(e->e*2)
                    .limit(n)
                    .sum();
    }

    static int compute(int k,int n) {
        int result = 0;

        int index =k;
        int count = 0;
        while (count < n){
            if (index%2==0 && Math.sqrt(index) > 20){
                result += index *2;
                count++;
            }
            index++;
        }
        return result;
    }
}
