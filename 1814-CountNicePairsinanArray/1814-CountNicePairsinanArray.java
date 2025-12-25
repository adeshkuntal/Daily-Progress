// Last updated: 12/25/2025, 9:23:32 PM
1class Solution {
2    public int countNicePairs(int[] nums) {
3        int mod = 1000000007;
4        long ans = 0;
5
6        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
7
8        for(int i = 0; i < nums.length; i++){
9            int key = nums[i] - rev(nums[i]);
10
11            int cnt = map.getOrDefault(key, 0);
12            ans = (ans + cnt) % mod;
13
14            map.put(key, cnt + 1);
15        }
16
17        return (int) ans;
18    }
19
20    public static int rev(int n){
21        int r = 0;
22        while(n > 0){
23            r = r * 10 + n % 10;
24            n = n / 10;
25        }
26        return r;
27    }
28}
29