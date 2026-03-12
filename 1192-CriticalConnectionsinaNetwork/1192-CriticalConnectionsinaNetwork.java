// Last updated: 3/12/2026, 9:55:40 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy1 = Integer.MAX_VALUE;
4        int buy2 = Integer.MAX_VALUE;
5        int sell1 = 0;
6        int sell2 = 0;
7
8        for(int price : prices){
9            buy1 = Math.min(buy1, price);
10            sell1 = Math.max(sell1, price - buy1);
11
12            buy2 = Math.min(buy2, price - sell1);
13            sell2 = Math.max(sell2, price - buy2);
14        }
15
16        return sell2;
17    }
18}