package com.rohit.O13_enumExamples;

public class Basic{
    enum Week  implements A {
          Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // every single one here is  public, static and final
        // since it is final we can't create child enums
        // type is week


        Week() {
            System.out.println("Constructor called" + this);
        }
        @Override
        public void hello() {
            System.out.println("How are you");
        }

            // this is not public or protected, only private or default
            // why? :- we don't want to create new objects
            // this is not the enum concept, that's why

            // internally: public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal()); // ordinal:- the position of enum decleration
    }
}
