public class R09_LC_Steps {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num) {
        return helper(num, 0); //helper: need to pass values in recursion calls only when we putting in the argument
    }
    static int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 ==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
