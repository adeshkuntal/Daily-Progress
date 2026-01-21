// Last updated: 1/21/2026, 12:34:53 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int bits = Integer.bitCount(num2);
4        int x = 0;
5
6        for (int i = 31; i >= 0 && bits > 0; i--) {
7            if ((num1 & (1 << i)) != 0) {
8                x |= (1 << i);
9                bits--;
10            }
11        }
12
13        for (int i = 0; i <= 31 && bits > 0; i++) {
14            if ((x & (1 << i)) == 0) {
15                x |= (1 << i);
16                bits--;
17            }
18        }
19
20        return x;
21    }
22}
23