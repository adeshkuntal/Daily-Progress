// Last updated: 4/5/2026, 12:34:08 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int vertical = 0; // Tracks vertical movement
4        int horizontal = 0; // Tracks horizontal movement
5
6        for (int i = 0; i < moves.length(); i++) {
7            char ch = moves.charAt(i);
8            if (ch == 'U') {
9                vertical += 1;
10            } else if (ch == 'D') {
11                vertical -= 1;
12            } else if (ch == 'R') {
13                horizontal += 1;
14            } else if (ch == 'L') {
15                horizontal -= 1;
16            }
17        }
18
19        // If both vertical and horizontal sums are zero, robot returns to origin
20        return vertical == 0 && horizontal == 0;
21    }
22}