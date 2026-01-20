// Last updated: 1/20/2026, 10:33:45 AM
1class Solution {
2    public int numTeams(int[] rating) {
3        int count = 0;
4
5        for (int i = 0; i < rating.length; i++) {
6            for (int j = i + 1; j < rating.length; j++) {
7                for (int k = j + 1; k < rating.length; k++) {
8                    if ((rating[i] < rating[j] && rating[j] < rating[k]) ||
9                        (rating[i] > rating[j] && rating[j] > rating[k])) {
10                        count++;
11                    }
12                }
13            }
14        }
15
16        return count;
17    }
18}
19