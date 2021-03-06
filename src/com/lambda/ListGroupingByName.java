package com.lambda;

import com.lambda.model.Person;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;


public class ListGroupingByName {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Sara", 'F', 20),
                new Person("Sara", 'F', 22),
                new Person("Bob", 'M', 20),
                new Person("Paula", 'F', 32),
                new Person("Paul", 'M', 32),
                new Person("Jack", 'M', 2),
                new Person("Jack", 'M', 72),
                new Person("Jill", 'F', 12));


        System.out.println(people.stream()
                                .collect(groupingBy(Person::getName)));

        //System.out.println(people.stream()
//                .collect(groupingBy(new Person().getName(),mapping(new Person().getAge()),toList())));

    }
}
