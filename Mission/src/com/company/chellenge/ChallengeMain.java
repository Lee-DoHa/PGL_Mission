package com.company.chellenge;

import com.company.basic.Lecturer;
import com.company.basic.Person;
import com.company.basic.Student;

import java.util.*;

public class ChallengeMain {
    public static void main(String[] args) {
        Person studentKim = new Student("Kim", 25);
        Person studentLee = new Student("Lee", 28);
        Person studentPark = new Student("Park", 23);

        Person lecturer = new Lecturer("Lee Doha", 25);

        Vector<Person> everyone = new Vector<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(studentPark);
        everyone.add(lecturer);
        printItems(everyone);

    }

    public static <T> void printItems(Iterable<T> iterable){
        Iterator<T> iterator = iterable.iterator();
        if(!iterator.hasNext()){
            System.out.println("No Elements");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("idx\titem\n");
        for (int i = 0; iterator.hasNext(); i++){
            T item = iterator.next();
            stringBuilder.append(String.format("%d\t%s\n", i, item));
        }
        System.out.println(stringBuilder);
    }
}
