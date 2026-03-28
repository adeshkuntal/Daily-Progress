// Last updated: 3/28/2026, 9:20:31 PM
1class Solution {
2    static final long mod = 1_000_000_007L;
3    
4    public int countVisiblePeople(int n, int pos, int k) {
5        long[] fact = new long[n+1];
6        long[] i_fact = new long[n+1];
7        fact[0] = 1;
8        for (int i = 1; i <= n; i++) {
9            fact[i] = fact[i - 1] * i % mod;
10        }
11
12        i_fact[n] = modPow(fact[n],mod-2,mod);
13        for (int i = n-1; i>=0; i--) {
14            i_fact[i] = i_fact[i+1]*(i+1)%mod;
15        } 
16
17        int l = pos;
18        int r = n-1-pos;
19        long ans = 0;
20
21        for(int j=0; j<=k; j++){
22            int q = k-j;
23            if(j <= l && q<= r){
24                long comL = fact[l]*i_fact[j]%mod * i_fact[l-j]%mod;
25                long comR = fact[r]*i_fact[q]%mod * i_fact[r-q]%mod;
26                ans = (ans+comL*comR%mod)%mod;
27            }
28        }
29        return (int)(ans*2%mod);
30    }
31
32    private long modPow(long base, long exp, long mod) {
33        long res = 1;
34        base %= mod;
35        while(exp > 0){
36            if((exp & 1) == 1){
37                res = res * base % mod;
38            }
39            base = base*base%mod;
40            exp >>= 1;
41        }
42        return res;
43    }
44}