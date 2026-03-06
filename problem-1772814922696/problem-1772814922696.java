// Last updated: 3/6/2026, 10:05:22 PM
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        boolean ans = true;
4        for(int i=0; i<s.length()-1; i++){
5            if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
6                int j = i+1;
7                while(j<s.length() && s.charAt(j)=='0'){
8                    j++;
9                }
10                if(j < s.length() && s.charAt(j)=='1'){
11                    ans = false;
12                }
13            }
14        }
15        return ans;
16    }
17}