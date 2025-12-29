// Last updated: 12/29/2025, 8:21:24 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0;
4        int right = s.length - 1;
5        
6        while (left < right) {
7            // Swap characters
8            char temp = s[left];
9            s[left] = s[right];
10            s[right] = temp;
11            
12            // Move towards the middle
13            left++;
14            right--;
15        }
16    }
17}