package rohit;

public class S02_Comparison {
    public static void main(String[] args) {
        String a = "Rohit";
        String b = "Rohit";

        // ==
//        System.out.println(a == b);

        String name1 = new String("Rohit");  // in this it creates new object of that's ref variable
        String name2 = new String("Rohit");

        System.out.println(name1 == name2);  // it gives false

        System.out.println(name1.equals(name2)); // it gives true because  in chacks values  that are equal

        System.out.println(name1.charAt(0)); // it  prints character at that particular index
    }
}
