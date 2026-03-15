// Last updated: 3/15/2026, 6:11:33 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        int i = 0;
4        String ans = "";
5        while(i < strs[0].length()){
6            char first = strs[0].charAt(i);
7            if(check(strs, i, first)){
8                ans += first;
9            }
10            else{
11                break;
12            }
13            i++;
14        }
15        return ans;
16    }
17
18    public boolean check(String[] s, int i, char first){
19        for(int j = 0; j < s.length; j++){
20            if(i >= s[j].length() || s[j].charAt(i) != first){
21                return false;
22            }
23        }
24        return true;
25    }
26}