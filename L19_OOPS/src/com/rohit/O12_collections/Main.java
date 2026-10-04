package com.rohit.O12_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34);
//        list2.add(78);
//        list2.add(56);
//        list2.add(52);

//        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(55);

        System.out.println(vector);
    }
}
