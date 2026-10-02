package com.rohit.O7_abstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("A am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}