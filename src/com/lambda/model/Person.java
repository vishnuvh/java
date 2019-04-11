package com.lambda.model;

public class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person (String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+","+gender+","+age;
    }

    private String name;
    private char gender;
    private Integer age;
}
