// Last updated: 1/19/2026, 10:27:55 AM
1class Solution {
2    public String makeGood(String s) {
3        StringBuilder sb = new StringBuilder(s);
4        int i = 0;
5        while (i<sb.length() - 1) {
6            char c1 = sb.charAt(i);
7            char c2 = sb.charAt(i + 1);
8            if (Character.toLowerCase(c1) == Character.toLowerCase(c2) && c1 != c2) {
9                sb.delete(i,i+2);
10                if(i>0){
11                    i--;
12                }
13            } 
14            else {
15                i++;
16            }
17        }
18        return sb.toString();
19    }
20}
21
22