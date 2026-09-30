package com.rohit.O5properties.inheritance;

public class Main {
    public static void main(String[] args) {
       Box box1 = new Box(4.6, 7.9, 9.9);
       Box box2 = new Box(box1);
       box1.getL();
//        System.out.println(box1.h+ " "+ box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h + " "+ box3.weight);

//        Box box5 =new BoxWeight(2,3,4,8); // here you can't access the properties of
//                         // BoxWeight class because its base and Box is only referencing it
//        System.out.println(box5.w);

        // there are many variables in both parent and child class
        // you are given access  to variables that are in the ref type  i.e. BoxWeight
        // hence, you should access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6);


//        BoxPrice box = new BoxPrice(5,8,200);
//
        BoxWeight box = new BoxWeight();
        BoxWeight.Greetings(); // we can inherit but we cannot override


        box1.Greetings();
    }
}
