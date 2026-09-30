package com.rohit.O3_staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;  // static means common to all the objects

    static void message(){
        System.out.println("Hello world");
//        System.out.println(this.age); // can't use this over here
    }

    public Human(int age, int salary, String name, boolean married) {  // constructor
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        Human.population +=1; // also work with this but it is static var not instance var
    }
}
