package com.rohit.O3_staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22,10000,"Rohit Singh",false);
//        Human rahul = new Human(34,15000,"Mohit Singh",true);
//
//        System.out.println(kunal.population);
//        System.out.println(rahul.population);
        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
     static void fun(){
//        greeting(); // you can't use this because it requires an instance
         // but the function you are using it in does not depend on instances

         // you can not access non-static stuff without referencing
         // their instance in a static context

         // here, here I am referencing it
         Main obj = new Main();
         obj.greeting();  // here it will work and accessed because here obj is created inside static
     }

     void fun2(){
        greeting(); // here it is fine because it is inside the main method
     }

    // we know that something that is non static, belongs to an object
    void greeting(){
        System.out.println("Hello!");
    }
}
