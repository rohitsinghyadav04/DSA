import java.util.ArrayList;
import java.util.Stack;

public class S02_SubSeq {
    public static void main(String[] args) {
//        subseqRet("","abc");
        System.out.println(subseqRet("","abc"));
    }
    static void subseq(String p, String up){  // here up just as left and p as right so if left==empty, return right
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));  // takes in String
        subseq(p,up.substring(1)); // rejecting or ignoring
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));  // takes in String
        ArrayList<String> right =  subseqRet(p,up.substring(1)); // rejecting or ignoring

        left.addAll(right); // we can also write as right.addAll(left)
        return left;  // we  can also return right because both are equal

    }
}
