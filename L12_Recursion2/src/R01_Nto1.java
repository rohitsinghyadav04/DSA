
public class R01_Nto1 {
    public static void main(String[] args) {
        fun(5);
//        concept(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void concept(int n){
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }
}