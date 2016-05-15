package com.geo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cloud on 15/05/2016.
 */
public class TestList {
    public static void main(String[] args) {
        List<Person> lp = new ArrayList<>();
        Person pers1 = new Student();
        // List<Person> lpers = new ArrayList<Student>(); // Compiler Error, because the relationship only holds for the classes, not lists of the classes
        List<? extends Person> lpers = new ArrayList<Student>();
//        lpers.add(new Student());
        lpers.get(0).sayHello();
    }
}
