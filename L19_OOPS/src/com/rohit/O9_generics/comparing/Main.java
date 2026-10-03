package com.rohit.O9_generics.comparing;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rohit = new Student(12, 89.12f);
        Student rahul = new Student(5, 99.54f);
        Student arpit = new Student(2, 95.54f);
        Student karan = new Student(13, 77.54f);
        Student sachin = new Student(9, 96.54f);

        Student[] list = {rohit, rahul, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks); // if we -minus then it will sort in descending order
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));  // lambda function

        System.out.println(Arrays.toString(list));

//        if(rohit.compareTo(rahul) < 0) {
//            System.out.println(rohit.compareTo(rahul));
//            System.out.println("rahul has more marks");
//        }
    }
}
