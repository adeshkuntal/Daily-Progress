// Last updated: 2/27/2026, 3:39:53 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] arr, int k) {
3        int ans = 0,si=0,ei=0,p=1;
4        while(ei< arr.length){
5            //grow
6            p=p*arr[ei];
7            //shrink
8            while(p>=k && si<=ei){
9                p=p/arr[si];
10                si++;
11            }
12            //ans update
13            ans = ans+(ei-si+1);
14            ei++;
15        }
16        return ans;
17    }
18}