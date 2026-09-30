package com.rohit.O1_introduction;

public class J02_WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;

//        Integer num = 45; // this create an obj of this

        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " +b);

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";
        // when a non-primitive is final you can't re-assign it
//        kunal = new com.rohit.intrdoduction.A("new object");
        
         A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("Random name");  // here all obj remove by garbage collector because obj pointing many objects
        }

    }
    static void swap(Integer a, Integer b){ // here Integer is the final class so it can't change its value so don't swap
        Integer temp = a;
        a = b;
        b =  temp;
    }
}

class A {
    final int num =10;
    String name;

    public A(String name) {
//        System.out.println("object  is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
