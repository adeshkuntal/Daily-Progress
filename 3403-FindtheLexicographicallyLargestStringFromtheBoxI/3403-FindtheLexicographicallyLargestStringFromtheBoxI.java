// Last updated: 2/26/2026, 2:33:08 PM
1class Solution {
2    public String answerString(String word, int n) {
3        if (n == 1) return word;
4        String ans = "";
5        int maxLen = word.length()-n+1;
6        for(int i=0; i<word.length(); i++){
7            String temp = "";
8            if(i+maxLen < word.length()){
9                temp = word.substring(i,i+maxLen);
10            }
11            else{
12                temp = word.substring(i);
13            }
14
15            if(temp.compareTo(ans) > 0){
16                ans = temp;
17            }
18        }
19
20        return ans;
21    }
22}