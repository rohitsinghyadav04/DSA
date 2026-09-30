package com.rohit.O4_singleton;

import com.rohit.O6_access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variable are pointing to just same object


        A a = new A(10,"Rohit");
        a.getNum();   // from (access) package to show getter and setter property in private function

    }
}
