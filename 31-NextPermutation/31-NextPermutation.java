// Last updated: 3/13/2026, 7:04:26 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
6
7        ArrayList<int[]> res = new ArrayList<>();
8
9        int start = intervals[0][0];
10        int end = intervals[0][1];
11
12        for(int i=1;i<intervals.length;i++){
13            if(intervals[i][0] <= end){
14                end = Math.max(end,intervals[i][1]);
15            }else{
16                res.add(new int[]{start,end});
17                start = intervals[i][0];
18                end = intervals[i][1];
19            }
20        }
21
22        res.add(new int[]{start,end});
23
24        return res.toArray(new int[res.size()][]);
25    }
26}