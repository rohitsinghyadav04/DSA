public class M10_Prime {
    public static void main(String[] args) {
        int n=20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+ " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c * c <= n){  //we can also write it as while(c <= sqrt(n)), instead of this we take square both sides
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
