package rohit;

public class Bs08_MountainArr {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of array
                // this may be the ans,  but look at left
                // this is why end != mid - 1
                end = mid;
            }else{
                // you are in ascending part of array
                start = mid +1; // because we know that if it's in desc, mid+1 element > mid element
            }
        }
        // int the end, start == end and pointing to the largest element because of the two checks above
        // start and end are always trying to find the largest element in  the above two checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end,  they have best ans till that time
        // and if we are saying that only one item is remaining , hence because of above line that is the best possible ans
        return start; // or can return end as both are equal( = )
    }
}
