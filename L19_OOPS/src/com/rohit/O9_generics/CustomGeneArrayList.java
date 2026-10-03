package com.rohit.O9_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGeneArrayList<T>{

    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size =0; // also working as index value

    public CustomGeneArrayList() {
        this.data = new Object[DEFAULT_SIZE]; //We can't create aan instance of generic type because bytecode has no idea about runtime
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomGeneArrayList list = new CustomGeneArrayList();
//        list.add(5);
//        list.add(3);
//        list.add(9);
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("544");

        CustomGeneArrayList<Integer> list3 = new CustomGeneArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);
    }
}
