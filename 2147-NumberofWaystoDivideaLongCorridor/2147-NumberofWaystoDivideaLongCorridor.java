// Last updated: 12/14/2025, 8:50:24 PM
1class Solution {
2    public int numberOfWays(String corridor) {
3        int mod = 1_000_000_007;
4        ArrayList<Integer> pos = new ArrayList<>();
5
6        for (int i = 0; i < corridor.length(); i++) {
7            if (corridor.charAt(i) == 'S') {
8                pos.add(i);
9            }
10        }
11
12        if (pos.size() % 2 == 1 || pos.size() == 0) {
13            return 0;
14        }
15
16        long res = 1;
17        for (int i = 2; i < pos.size(); i += 2) {
18            int len_of_gap = pos.get(i) - pos.get(i - 1);
19            res = (res * len_of_gap) % mod;
20        }
21
22        return (int) res;
23    }
24}