package com.rohit.O8_interfaces.extendDemo2;

public interface A {
    // static interface methods should always have a body
    // call by the interface name
    static  void greeting(){
        System.out.println("Hey i am static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
