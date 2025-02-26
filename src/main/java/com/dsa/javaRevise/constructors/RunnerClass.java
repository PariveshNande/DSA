package com.dsa.javaRevise.constructors;

public class RunnerClass {
    public static void main(String[] args) {
        Student student1 = new Student(5, "Aman", "Pune");

        Student student2 = new Student("Naman", "Pune", 5);
        student2.name = "Parivesh";
        student2.city = "Pune";
        student2.id = 15;

        student2.showDetails();

        student2.showDetails("James");
    }
}
