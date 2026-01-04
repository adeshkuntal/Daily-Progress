// Last updated: 1/4/2026, 2:19:30 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int max = 0;
4
5        for (int i = 0; i + word.length() <= sequence.length(); i++) {
6            int count = countWord(sequence, word, i, i + word.length());
7            max = Math.max(max, count);
8        }
9
10        return max;
11    }
12
13    public static int countWord(String sq, String word, int start, int end) {
14        if (end > sq.length()) {
15            return 0;
16        }
17
18        if (sq.substring(start, end).equals(word)) {
19            return 1 + countWord(sq, word, start + word.length(), end + word.length());
20        }
21
22        return 0;
23    }
24}
25