package rohit;

public class Bs07_InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}; // array in which we don't know the end value this can work for that infinite array
        int target = 10 ;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr, int target){
        // first find the range
        //first start with a box  of size 2
        int start = 0;
        int end  = 1;
        // condition for the range to lie int the range
        while(target > arr[end]){
            int newStart = end+1; //this is like temp
            // double the box value
            // end = previous end + sizeofbox*2
            end =  end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearh(arr, target, start, end);
    }

    static int binarySearh(int[] arr , int target, int start, int end){
        while(start<=start){
            // find the element
            int mid = start + (end - start)/2;
            if ( target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
