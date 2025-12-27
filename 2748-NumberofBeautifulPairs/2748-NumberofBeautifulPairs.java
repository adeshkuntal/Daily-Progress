// Last updated: 12/27/2025, 1:38:53 PM
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int count = 0;
4        for(int i=0; i<nums.length; i++){
5            int first = nums[i];
6            while(first >= 10){
7                first /= 10;
8            }
9            for(int j=i+1; j<nums.length; j++){
10                int last = nums[j] % 10;
11                if(gcd(first, last) == 1){
12                    count++;
13                }
14            }
15        }
16        return count;
17    }
18
19    public static int gcd(int x, int y){
20        while(y != 0){
21            int temp = x % y;
22            x = y;
23            y = temp;
24        }
25        return x;
26    }
27}