// Last updated: 2/26/2026, 9:25:57 PM
1class Solution {
2    public String makeGood(String s) {
3        StringBuilder str = new StringBuilder(s);
4        for(int i = 0; i < str.length() - 1; i++){
5            if(Math.abs(str.charAt(i) - str.charAt(i+1)) == 32){
6                str.delete(i, i+2);
7                i = -1;
8            }
9        }
10        
11        return str.toString();
12    }
13}