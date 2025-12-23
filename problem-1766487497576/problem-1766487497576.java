// Last updated: 12/23/2025, 4:28:17 PM
1class Solution {
2    static int mod = (int)1e9+7;
3    public int numWays(String s) {
4        int n = s.length(), sum=0;
5        char[] arr = s.toCharArray();
6        for(char ch:arr){
7            sum+=ch-'0';
8        }
9        if(sum%3!=0){
10            return 0;
11        }
12        sum=sum/3;
13
14        if(sum==0){
15            return (int)((((long)(n-2)*(n-1))/2)%mod);
16        }
17
18        int si=0, c1=0, c2=0;
19        for(char ch:arr){
20            si+=ch-'0';
21            if(si==sum)
22                c1++;
23            if(si==2*sum)
24                c2++;
25        }
26        return (int)(((long)c1*c2)%mod);
27    }
28}