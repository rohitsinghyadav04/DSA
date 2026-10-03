package com.rohit.O11_cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rohit = new Human(34,"Rohit");
//        Human twin = new Human(rohit);

        Human twin = (Human)rohit.clone();
        System.out.println(twin.age + " " +twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(rohit.arr));  // Shallow copy:- here rohit also change

    }
}
