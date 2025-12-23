// Last updated: 12/23/2025, 10:00:53 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
4        int common = 0;
5
6        for(int i = 0; i < minLen; i++){
7            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
8                common++;
9            } else {
10                break;
11            }
12        }
13
14        if(common == 0){
15            return -1;
16        }
17
18        int ans = (s1.length() - common) + (s2.length() - common) + (s3.length() - common);
19        return ans;
20    }
21}
22