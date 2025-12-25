// Last updated: 12/25/2025, 10:20:52 PM
1class Solution {
2    static int[] primes = {2,3,5,7,11,13,17,19,23,29};
3    static int mod = 1000000007;
4
5    public int numberOfGoodSubsets(int[] nums){
6        int[] count = new int[31];
7        for (int num : nums) count[num]++;
8
9        int[] masked = new int[31];
10        for(int i=2 ; i<31 ; i++){
11            int mask=0; 
12            int temp=i;
13            for(int j=0 ; j<10 ; j++){
14                int prime = primes[j];
15                int cnt=0;
16                while(temp%prime==0){
17                    temp/=prime;
18                    cnt++;
19                }
20                if(cnt>1){
21                    mask=-1;
22                    break;
23                }
24                if(cnt==1){
25                    mask = mask + (1<<j); 
26                }
27            }
28            masked[i] = mask;
29        }
30        long[] dp = new long[1024]; //2^10 here why 10 as length of primes
31        dp[0] = 1;
32        for(int i=2 ; i<=30 ; i++){
33            if(count[i]==0 || masked[i]==-1) continue;
34
35            int curMask = masked[i];
36            long[] next = dp.clone();
37
38            for (int m = 0; m < 1024; m++) {
39                if ((m & curMask) == 0) {
40                    next[m | curMask] = (next[m | curMask] + dp[m] * count[i]) % mod;
41                }
42            }
43
44            dp = next;
45
46        }
47        long ans = 0;
48        for (int i = 1; i < 1024 ; i++){
49            ans = (ans + dp[i]) % mod;
50        }
51
52        long pow = mod2Pow(count[1])%mod;
53
54        return (int)(ans*pow%mod);
55    }
56    private long mod2Pow(int exp) {
57        long res = 1;
58        while (exp-- > 0) res = (res*2)%mod;
59        return res;
60    }
61}