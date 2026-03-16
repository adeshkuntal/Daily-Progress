// Last updated: 3/16/2026, 8:07:19 PM
1class Solution {
2    public int compress(char[] chars) {
3        String s = "";
4        char x = chars[0];
5        int count = 1;
6        for(int i=1; i<chars.length; i++){
7            if(chars[i] == x){
8                count++;
9            }
10            else{
11                s += x;
12                if(count > 1){
13                    s += count;
14                }
15                x = chars[i];
16                count = 1;
17            }
18        }
19        s += x;
20        if(count > 1){
21            s += count;
22        }
23
24        for(int i=0;i<s.length();i++){
25            chars[i] = s.charAt(i);
26        }
27
28        return s.length();
29    }
30}