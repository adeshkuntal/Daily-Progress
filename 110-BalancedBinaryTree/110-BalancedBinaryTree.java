// Last updated: 2/24/2026, 11:27:35 AM
1class Solution {
2    public boolean isBalanced(String num) {
3        int even = 0;
4        int odd = 0;
5        for(int i = 0; i < num.length(); i++){
6            if(i % 2 == 0){
7                even += num.charAt(i) - '0';
8            }
9            else{
10                odd += num.charAt(i) - '0';
11            }
12        }
13        return even == odd;
14    }
15}