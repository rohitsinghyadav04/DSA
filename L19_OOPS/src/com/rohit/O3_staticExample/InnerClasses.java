package com.rohit.O3_staticExample;

public class InnerClasses {

    static class Test {  // it doesn't depend on obj of InnerClass but Test and main can depend on each other
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}