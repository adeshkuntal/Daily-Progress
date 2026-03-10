// Last updated: 3/10/2026, 12:41:46 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min_Price = Integer.MAX_VALUE;
4        int maxProfit = 0;
5        
6        for (int price : prices) {
7            if (price < min_Price) {
8                min_Price = price;
9            } else if (price - min_Price > maxProfit) {
10                maxProfit = price - min_Price;
11            }
12        }
13        
14        return maxProfit;
15    }
16}