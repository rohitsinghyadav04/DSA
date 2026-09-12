package rohit;

public class Ls08_EvenDigits_Lc1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
   //     System.out.println(digits2(4566789));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
     //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

//    static int digits2(int num){
//        return (int)(Math.log10(num)) +1;
//    }

    //count number of digits in a number
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
