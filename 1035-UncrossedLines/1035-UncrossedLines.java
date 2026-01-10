// Last updated: 1/10/2026, 4:14:15 PM
1class Solution {
2    public int change(int amount, int[] coin) {
3        int[][] dp = new int[amount+1][coin.length];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return Coin(coin,amount,0,dp);
8    }
9    public static int Coin(int[] coin,int amount,int idx,int[][] dp){
10        if(amount == 0){
11            return 1;
12        }
13        if(idx == coin.length){
14            return 0;
15        }
16        int inc = 0;
17        int exc = 0;
18        if(dp[amount][idx] != -1){
19            return dp[amount][idx];
20        }
21        if(amount >= coin[idx]){
22            inc = Coin(coin,amount-coin[idx],idx,dp);
23        }
24        exc = Coin(coin,amount,idx+1,dp);
25
26        return dp[amount][idx] = inc + exc;
27    }
28}