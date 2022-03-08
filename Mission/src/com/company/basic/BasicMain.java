package com.company.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicMain {

    public static void main(String[] args) {
        Person studentKim = new Student("Kim", 25);
        Person studentLee = new Student("Lee", 28);
        Person studentPark = new Student("Park", 23);

        Person lecturer = new Lecturer("Lee Doha", 25);

        List<Person> everyone = new ArrayList<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(studentPark);
        everyone.add(lecturer);

        for (Person person: everyone){
            person.speak();
        }
    }
}
