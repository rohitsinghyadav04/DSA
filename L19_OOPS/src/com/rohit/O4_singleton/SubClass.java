package com.rohit.O4_singleton;

import com.rohit.O6_access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45,"Rohit");
//        int n = obj.num;
    }
}


class SubSubclass extends SubClass {
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45,"Rohit");
        int n = obj.num;
    }
}

