// Last updated: 1/28/2026, 9:55:05 PM
1// class Solution {
2//     public int[] countRectangles(int[][] r, int[][] p) {
3//         int count = 0;
4//         int[] ans = new int[p.length];
5//         for(int j=0; j<p.length; j++){
6//             int x = p[j][0];
7//             int y = p[j][1];
8//             for(int i=0; i<r.length; i++){
9//                 if(x <= r[i][0] && y <= r[i][1]){
10//                     ans[j]++;
11//                 }
12//             }
13//         }
14
15//         return ans;
16//     }
17// }
18
19
20
21
22class Solution {
23    public int[] countRectangles(int[][] rectangles, int[][] points) {
24        int[] res = new int[points.length];
25        List<List<Integer>> group = new ArrayList<>(101);
26        for(int i = 0; i < 101; i++){
27            group.add(new ArrayList<>());
28        }
29        
30        for(int[] rec : rectangles){
31            int l = rec[0];
32            int h = rec[1];
33            group.get(h).add(l);
34        }
35        
36        for(int i = 0; i < 101; i++){
37            Collections.sort(group.get(i));   
38        }
39        
40        for(int i = 0; i < points.length; i++){
41            int count = 0;
42            int x = points[i][0];
43            int y = points[i][1];
44            for(int j = y; j < 101; j++){
45                List<Integer> cur = group.get(j);
46                int index = binarySearch(cur, x);
47                count += cur.size() - index;
48            }
49            res[i] = count;
50        }
51
52        return res;
53    }
54    
55    private int binarySearch(List<Integer> list, int x){
56        int left = 0;
57        int right = list.size();
58        while(left < right){
59            int mid = left + (right - left) / 2;
60            if(list.get(mid) >= x){
61                right = mid;
62            } else{
63                left = mid + 1;
64            }
65        }
66        return left;
67    }
68}