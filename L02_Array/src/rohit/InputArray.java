package rohit;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //array of primitives
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 25;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // [23,25,30,40,50]
        System.out.print(arr[3]);

//        input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//         }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){ //for every element in array, print the element
//            System.out.print(num + " "); // here num represents elements of array
//        }

//        System.out.println(arr[5]);// error : index out of bound

        // Array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));


        //modify
        str[1] ="Rohit Singh";
        System.out.println(Arrays.toString(str));
    }
}
