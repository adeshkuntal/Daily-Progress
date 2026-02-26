// Last updated: 2/26/2026, 2:32:46 PM
1class Solution {
2    public String answerString(String word, int numFriends) {
3        if (numFriends == 1) return word;
4
5        String maxP1 = "";
6        int maxLength = word.length() - numFriends + 1;
7
8        for (int i = 0; i < word.length(); i++) {
9            String temp = "";
10            if (i + maxLength <= word.length()) {
11                temp = word.substring(i, i + maxLength);
12            } else {
13                temp = word.substring(i);
14            }
15
16            if (temp.compareTo(maxP1) > 0) {
17                maxP1 = temp;
18            }
19        }
20        return maxP1;
21    }
22}