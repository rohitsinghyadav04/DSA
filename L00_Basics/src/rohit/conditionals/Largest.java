package rohit.conditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        // Q: Find largest of three numbers
//        int max = a;
//        if ( b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);


//        System.out.println(Math.max(34, 57));

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
     }
}
