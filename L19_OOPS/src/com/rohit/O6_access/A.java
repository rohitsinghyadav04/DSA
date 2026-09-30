package com.rohit.O6_access;

public class A {
    protected int num;     // we can access anywhere in this file and we can access outside by using getter and setter
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
