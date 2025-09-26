// Last updated: 9/26/2025, 1:51:24 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min_Price = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < min_Price) {
                min_Price = price;
            } else if (price - min_Price > maxProfit) {
                maxProfit = price - min_Price;
            }
        }
        
        return maxProfit;
    }
}