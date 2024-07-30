package com.tiagoamp.productcatalog.repository;

public class MyFirstClass {

    public static void main(String[] args1) {
        Student s1 = new Student(); //creating an object of Student
        s1.id = 15;
        s1.name = "Pera Peric";
        System.out.println(s1.id); //accessing member through reference variable
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.id = 15;
        s2.name = "Mika Mikic";
        System.out.println(s2.id); //accessing member through reference variable
        System.out.println(s2.name);

    }
}