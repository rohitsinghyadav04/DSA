package rohit.conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Q: Print numbers from 1n to 5
//        for (int num=1; num<=5; num += 2) {
//            System.out.println(num);
//        }

        // print no from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = in.nextInt();
//        for(int num = 1; num < n; num++) {
//         System.out.println(num + " ");
//            System.out.println("Hello World");
//        }
//
//        //while loops
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        //do while
        /*
        do{

        } while (condition)

         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
