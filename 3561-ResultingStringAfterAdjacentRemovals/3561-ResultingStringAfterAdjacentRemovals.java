// Last updated: 12/27/2025, 6:46:25 PM
1class Solution {
2    public String resultingString(String s) {
3        StringBuilder sb = new StringBuilder();
4        
5        for (char ch:s.toCharArray()) {
6            if (sb.length()>0) {
7                char top = sb.charAt(sb.length()-1);
8                int diff = Math.abs(top-ch);
9                
10                if (diff == 1 || diff == 25) {
11                    sb.deleteCharAt(sb.length()-1);
12                    continue;
13                }
14            }
15            sb.append(ch); 
16        }
17
18        return sb.toString();
19    }
20}