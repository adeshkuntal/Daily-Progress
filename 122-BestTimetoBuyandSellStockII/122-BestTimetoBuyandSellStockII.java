// Last updated: 3/10/2026, 12:46:34 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5        for(int price : prices){
6            if(price < minPrice){
7                minPrice = price;
8            }
9            else{
10                if(price-minPrice > maxProfit){
11                    maxProfit = price-minPrice;
12                }
13            }
14        }
15
16        return maxProfit;
17    }
18}