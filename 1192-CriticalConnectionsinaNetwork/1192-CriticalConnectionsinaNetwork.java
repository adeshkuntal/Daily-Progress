// Last updated: 3/12/2026, 8:06:50 PM
1class Solution {
2    public int maxProfit(int[] price) {
3        int profit = 0;
4
5        for(int i=1;i<price.length;i++){
6            if(price[i] > price[i-1]){
7                profit += price[i] - price[i-1];
8            }
9        }
10
11        return profit;
12    }
13}