// Last updated: 3/20/2026, 10:35:34 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4
5        for(int i = 0; i < s.length(); i++){
6            freq[s.charAt(i) - 'a']++;
7        }
8
9        for(int i = 0; i < s.length(); i++){
10            if(freq[s.charAt(i) - 'a'] == 1){
11                return i;
12            }
13        }
14
15        return -1;
16    }
17}