package rohit;

public class Ls09_RichestCusWealth_Lc1972 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };
        Ls09_RichestCusWealth_Lc1972 obj = new Ls09_RichestCusWealth_Lc1972();
        int result = obj.maximumWealth(accounts);
        System.out.println("Richest Customer Wealth = " + result);
    }
    public int maximumWealth(int[][] accounts) {
        //person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) { // ENHANCED for(int anInt : ints){
                                                                           // int sum = 0// }
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];   // ENHANCED for(int anInt : ints){
                                                               // sum += anInt }
            }

            // now we have sum of accounts of person
            // check with overall answer
            if (sum > ans){
                ans =  sum;
            }
        }
        return ans;
    }
}
