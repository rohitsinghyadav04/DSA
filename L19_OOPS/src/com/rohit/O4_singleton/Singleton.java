package com.rohit.O4_singleton;

public class Singleton {
    private Singleton(){  // constructor

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj only is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
