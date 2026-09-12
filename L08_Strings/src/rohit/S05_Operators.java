package rohit;

import java.util.ArrayList;

public class S05_Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');     // this print ascii values of that characters in numbers
        System.out.println("a" + "b");    // concatenation between a and b, here  + will works and add but - will not work
        System.out.println((char)('a' + 3));  // print d
        System.out.println("a" + 1);   // prints a1
        // this is same as after a few step: "a" + "1"
        // integer will converted into Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(55));

        String ans = new Integer(55) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" +  'b');  // it prints ab because  if any one's datatype is string then it only print all in strings format
    }
}
