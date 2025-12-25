// Last updated: 12/25/2025, 1:25:50 PM
1class Solution {
2    public int distMoney(int money, int children) {
3        int ans = 0;
4
5        if (money < children) return -1;
6        if (money > children * 8) return children - 1;
7
8        while (money > 0 && money - 8 >= children - 1) {
9            ans++;
10            money -= 8;
11            children--;
12        }
13
14        if (money == 4 && children == 1) ans--;
15
16        return ans;
17    }
18}
19