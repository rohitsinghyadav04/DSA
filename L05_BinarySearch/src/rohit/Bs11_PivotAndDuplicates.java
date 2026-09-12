package rohit;

public class Bs11_PivotAndDuplicates {
    public static void main(String[] args) {

    }
    // Use this for non-duplicates
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] >= start){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    // THIS IS ANOTHER PROGRAM FOR DUPLICATION OF ELEMENTS IN ARRAY
    // this will not work in duplicate  values

    // Use this when array contains duplicates
    static int findPivotWithDuplicates (int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at middle, end are equal then just  skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the elements

                // NOTE: what if these elements at start and end were the pivot
                if (arr[start]  > arr[start+1]){

                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start]  ==  arr[mid] && arr[mid] > arr[end])) {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
