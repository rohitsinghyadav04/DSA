package com.rohit.O5properties.inheritance;

public class Box {
    private double l;   // making it private known as hiding data hiding  or data  hiding
    double h;
    double w;
//    double weight;

    Box () {
        this.h  = -1;
        this.l = -1;
        this.w = -1;
    }

    static void Greetings(){
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {  // accessing private variables
        return l;
    }

    // cube
    Box(double side) {

//        super(); object class

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
