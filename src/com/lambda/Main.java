package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(5));

        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(5));

        List<Emp> eL = new ArrayList<>();
        eL.add(new Emp("a",10));
        eL.add(new Emp("b",5));
        Collections.sort(eL,(a, b)->(a.getId()<b.getId())?-1:(a.getId()>b.getId())?1:0);
        Collections.sort(eL,(a, b)->(a.getName().compareTo(b.getName())));
        //Collections.sort(eL,(a, b)->(Comparator.comparing(com.lambda.Emp::getName)));

        System.out.println(eL);

    }
}

class Emp{
    public Emp(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name+":"+id;
    }

    private String name;
    private Integer id;
}
