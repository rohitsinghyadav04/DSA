package rohit;

public class Bs05_SmallestLetter {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            //int mid=(start + end)/2; //might b that this can exceeds the limit of int
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
