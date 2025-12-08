// Last updated: 12/8/2025, 7:35:17 PM
1class Solution {
2    public int countTriples(int n) {
3        int ans = 0;
4        for(int i=1; i<=n; i++){
5            for(int j=1; j<=n; j++){
6                for(int k=1; k<=n; k++){
7                    if(((i*i) + (j*j)) == k*k){
8                        ans++;
9                    }
10                }
11            }
12        }
13        return ans;
14    }
15}
16