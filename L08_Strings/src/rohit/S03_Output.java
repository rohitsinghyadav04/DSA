package rohit;

import java.util.Arrays;

public class S03_Output {
    public static void main(String[] args) {
        System.out.println(56);   // it calls .toString method to print 56
        System.out.println("Rohit");
        System.out.println(new int []{1,2,3,4}); // it will print some random values because it makes nw object  but o/p not mentioned
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); // now it will print actual values of that array // also called function overriding because of .toString method

        String name=null;
        System.out.println(name); // it prints null
    }
}
