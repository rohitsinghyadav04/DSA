package rohit;

public class Ls02_TargetElemenetAndReturnElement {
    public static void main(String[] args) {
        int[] nums={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target =19;
        int ans = linearSearch2(nums,target);
        System.out.println(ans);
    }
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above are executed
        // hence target not found
        return Integer.MIN_VALUE;
       }
    }
