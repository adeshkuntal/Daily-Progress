// Last updated: 4/5/2026, 12:34:48 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0;
4        int y = 0;
5
6        for(int i = 0; i < moves.length(); i++){
7            char ch = moves.charAt(i);
8            if(ch == 'R') x++;
9            else if(ch == 'L') x--;
10            else if(ch == 'U') y++;
11            else y--;
12        }
13
14        return x == 0 && y == 0;
15    }
16}