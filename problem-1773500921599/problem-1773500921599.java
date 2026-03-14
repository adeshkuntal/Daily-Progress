// Last updated: 3/14/2026, 8:38:41 PM
1class Solution {
2    public int gcd(int a,int b){
3        while(b != 0){
4            int t = a%b;
5            a = b;
6            
7            b = t;
8        }
9        return a;
10    }
11    public long gcdSum(int[] nums) {
12        int n = nums.length;
13        int[] prefix = new int[n];
14        int mx = nums[0];
15        for(int i=0; i<n; i++){
16            mx = Math.max(mx,nums[i]);
17            prefix[i] = gcd(nums[i],mx);
18        }
19
20        Arrays.sort(prefix);
21        int l = 0;
22        int r = n-1;
23        long sum = 0;
24
25        while(l < r){
26            sum += gcd(prefix[l],prefix[r]);
27            l++;
28            r--;
29        }
30        return sum;
31    }
32}