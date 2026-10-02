package com.rohit.O7_abstractDemo;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("A am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
