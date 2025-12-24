// Last updated: 12/24/2025, 6:55:50 PM
1class Solution {
2    public int countCollisions(String d) {
3        int n = d.length();
4        int l = 0;
5        int r = n - 1;
6        while (l < n && d.charAt(l) == 'L'){
7            l++;
8        }
9        while (r >= 0 && d.charAt(r) == 'R'){
10            r--;
11        }
12        int count = 0;
13        for (int i = l; i <= r; i++) {
14            if (d.charAt(i) != 'S'){
15                count++;
16            }
17        }
18        return count;
19    }
20}
21