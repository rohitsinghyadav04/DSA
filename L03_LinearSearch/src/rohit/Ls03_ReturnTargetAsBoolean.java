package rohit;

public class Ls03_ReturnTargetAsBoolean {
    public static void main(String[] args) {
        int[] nums={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target =19;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }
    // search the element and return true if found
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above are executed
        // hence target not found
        return false;
    }
}
