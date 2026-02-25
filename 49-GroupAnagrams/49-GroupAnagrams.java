// Last updated: 2/25/2026, 7:45:57 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int len = flowerbed.length;
4        int i = 0;
5        while(i < len && n > 0) {
6            if(flowerbed[i] == 1){
7                i += 2;
8            }
9            else if(i == len - 1 || flowerbed[i + 1] == 0) {
10                n--;
11                i += 2;
12            }
13            else{
14                i += 3;
15            }
16        }
17        return n <= 0;
18    }
19}