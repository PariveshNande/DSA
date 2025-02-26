package com.dsa.javaRevise;

public class VariableDataType {

    public static void variables(){
        System.out.println("\nVariables in Java");
        int x = 50;
        int y = 10;
        System.out.println("value of x is : " + x);
        System.out.println("value of y is : " + y);
    }

    public static void dataTypes(){
        System.out.println("\nPrimitive Data Types in Java");
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64l;
        float e = 32.00f;
        double f = 64.00f;
        boolean g = true;
        boolean h = false;
        System.out.println("value of int is : " + a + " bits");
        System.out.println("value of short is : " + b + " bits");
        System.out.println("value of int is : " + c + " bits");
        System.out.println("value of long is : " + d + " bits");
        System.out.println("value of float is : " + e + " bits");
        System.out.println("value of double is : " + f + " bits");
        System.out.println("value of boolean is : " + g);
        System.out.println("value of boolean is : " + h);
    }

    public static void message(String message) {
        System.out.println("\nPrint Statements in Java");
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println("DSA Tutorial");
        message("Running message method");
        variables();
        dataTypes();
        /**
         * Using non-primitive Data Type Student
         */
        Student student = new Student();
        System.out.println("\nnon-primitive data type in Java");
        System.out.println(student.name = "Jhon Doe");
        System.out.println(student.age = 22);
        System.out.println(student.city = "San Francisco");
        System.out.println(student.className = "12th");
        System.out.println(student.marks = 91.00f);
    }
}

class Student{

    String name;

    String className;

    String city;

    int age;

    float marks;
}
