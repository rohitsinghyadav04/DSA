package rohit;

import java.util.Arrays;

public class Ls04_SearchInStrings {
    public static void main(String[] args) {
        String name = "Rohit";
        char target = 'o';
//        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){ // here String converted into CharArray
            if (ch == target){
                return true;
            }
        }

        return false;
    }



    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
