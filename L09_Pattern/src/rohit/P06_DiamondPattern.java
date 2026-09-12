package rohit;

public class P06_DiamondPattern {
    public static void main(String[] args) {
        pattern28(5);
    } 
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n? 2*n-row: row;

            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
