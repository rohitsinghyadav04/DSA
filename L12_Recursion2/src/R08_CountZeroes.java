public class R08_CountZeroes {
    public static void main(String[] args) {
//        System.out.println(count(30210004));
//    }
//    static int count(int n){
//        return helper(n,0);
//    }
//
//    // special pattern, how to pass a value to above value
//    static int helper(int n, int c){
//        if(n==0){
//            return c;
//        }
//        int rem = n%10;
//        if(rem == 0) {
//            return helper(n/10, c+1);
//        }
//        return helper(n/10,c);
//    }
        p1 obj=new p1(5.5,6.3);
        int c = (int)obj.getterA();
        int d = (int)obj.getterB();
        System.out.println(c+d);

//        p2 obj2 = new p2(5.5,6.3);
//        System.out.println(obj2.getter());
    }
}
class p1{
    private Object a;
    private Object b;
    p1(Object a, Object b){
        this.a=a;
        this.b=b;
    }
    Object getterA (){
        return a;
    }
    Object getterB (){
        return b;
    }

}
class p2{
    private double a;
    private double b;
    p2(double a, double b){
        this.a=a;
        this.b=b;
    }
    double getter (){
        return a+b;
    }
}
