package rohit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list =new ArrayList<>();
//        list.add(67);
//        list.add(78);
//        list.add(45);
//        list.add(438);
//        list.add(278);
//        list.add(784);
//        list.add(9845);

//        System.out.println(list.contains(45));

//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

//        System.out.println(list);
    }
}
