package com.company.basic;

public class Lecturer extends AbstractPerson{
    public Lecturer(String name, int age){
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(String.format("My name is %s, and I am the Lecturer in this class.", getName()));
    }
}
