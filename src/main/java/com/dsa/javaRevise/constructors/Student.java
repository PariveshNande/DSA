package com.dsa.javaRevise.constructors;

public class Student {
    String name;
    String city;
    int id;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println(id);
        System.out.println(name);
        System.out.println(city);
    }

    //Constructor Overloading

    public Student(String name, String city, int id) {
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println(id);
        System.out.println(name);
        System.out.println(city);
    }

    //same goes for method overloading
    public void showDetails() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(id);
    }

    public void showDetails(String name) {
        System.out.println(name);
    }
}
