package rohit;

import java.util.Arrays;

public class S08_Methods {
    public static void main(String[] args) {
        String name = "Rohit Singh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // it actually does not change actual object because its String so it creates new object
        System.out.println(name);
        System.out.println(name.indexOf('h'));
        System.out.println("    Rohit   ".strip()); // removes white spaces
        System.out.println(Arrays.toString(name.split("")));  // it cuts the words make them, separate with comma where the space is there

    }
}
