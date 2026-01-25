// Last updated: 1/25/2026, 9:47:02 PM
1class Solution {
2    public int maxProfit(int[] inventory, int orders) {
3        int mod = 1000000007;
4        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
5        for (int v : inventory){
6            pq.add(v);
7        }
8
9        long res = 0;
10        int cur = pq.poll();
11        int count = 1;
12
13        while (orders > 0) {
14            int next = pq.isEmpty() ? 0 : pq.peek();
15
16            long total = (long) (cur - next) * count;
17
18            if (total <= orders) {
19                long sum = (long) (cur + next + 1) * (cur - next) / 2;
20                res = (res + sum * count) % mod;
21                orders -= total;
22            } else {
23                int stop = cur - orders / count;
24                long sum = (long) (cur + stop + 1) * (cur - stop) / 2;
25                res = (res + sum * count) % mod;
26                res = (res + (long) stop * (orders % count)) % mod;
27                orders = 0;
28            }
29
30            if (!pq.isEmpty()) cur = pq.poll();
31            count++;
32        }
33
34        return (int) res;
35    }
36}
37