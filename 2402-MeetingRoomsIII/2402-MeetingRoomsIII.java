// Last updated: 1/13/2026, 3:52:25 PM
1class Solution {
2    public int mostBooked(int n, int[][] meetings) {
3        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
4
5        PriorityQueue<Integer> free = new PriorityQueue<>();
6        for(int i = 0; i < n; i++) free.add(i);
7
8        PriorityQueue<long[]> busy = new PriorityQueue<>(
9            (a, b) -> a[0] == b[0] ? (int)(a[1] - b[1]) : (int)(a[0] - b[0])
10        );
11
12        int[] count = new int[n];
13
14        for(int[] m : meetings) {
15            long start = m[0];
16            long end = m[1];
17
18            while(!busy.isEmpty() && busy.peek()[0] <= start) {
19                free.add((int)busy.poll()[1]);
20            }
21
22            if(!free.isEmpty()) {
23                int room = free.poll();
24                count[room]++;
25                busy.add(new long[]{end, room});
26            } else {
27                long[] curr = busy.poll();
28                count[(int)curr[1]]++;
29                curr[0] += (end - start);
30                busy.add(curr);
31            }
32        }
33
34        int res = 0;
35        for(int i = 1; i < n; i++) {
36            if(count[i] > count[res]) {
37                res = i;
38            }
39        }
40        return res;
41    }
42}
43