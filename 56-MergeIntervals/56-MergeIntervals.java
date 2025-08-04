// Last updated: 8/4/2025, 6:58:06 PM
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> l = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                l.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        l.add(Arrays.asList(start, end));

        // Convert List<List<Integer>> to int[][]
        int[][] result = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) {
            result[i][0] = l.get(i).get(0);
            result[i][1] = l.get(i).get(1);
        }

        return result;
    }
}
