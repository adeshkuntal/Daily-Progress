// Last updated: 2/27/2026, 2:38:10 PM
1class Solution {
2    public boolean winnerOfGame(String colors) {
3        int aMoves = 0;
4        int bMoves = 0;
5
6        for(int i = 1; i < colors.length() - 1; i++){
7            if(colors.charAt(i - 1) == 'A' && 
8               colors.charAt(i) == 'A' && 
9               colors.charAt(i + 1) == 'A'){
10                aMoves++;
11            }
12
13            if(colors.charAt(i - 1) == 'B' && 
14               colors.charAt(i) == 'B' && 
15               colors.charAt(i + 1) == 'B'){
16                bMoves++;
17            }
18        }
19
20        return aMoves > bMoves;
21    }
22}