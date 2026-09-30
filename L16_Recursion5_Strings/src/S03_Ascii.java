import java.util.ArrayList;

public class S03_Ascii {
    public static void main(String[] args) {
//        subseqAscii("","abc");
        System.out.println(subseqAsciiRet("", "abc"));
    }
    static void subseqAscii(String p, String up){  // here up just as left and p as right so if left==empty, return right
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));  // takes in String
        subseqAscii(p,up.substring(1)); // rejecting or ignoring
        subseqAscii(p + (ch + 0),up.substring(1));
    }


    static ArrayList<String> subseqAsciiRet(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));  // takes in String
        ArrayList<String> second =  subseqAsciiRet(p,up.substring(1)); // rejecting or ignoring
        ArrayList<String> third =  subseqAsciiRet(p + (ch+0),up.substring(1)); // rejecting or ignoring

        first.addAll(second);
        first.addAll(third);
        return first;  // we  can also return second because both are equal

    }
}
