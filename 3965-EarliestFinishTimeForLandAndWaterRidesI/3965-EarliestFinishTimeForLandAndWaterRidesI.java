// Last updated: 8/4/2025, 6:49:24 PM
class Solution {
    public int earliestFinishTime(int[] landStart, int[] landDuration, int[] waterStart, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < landStart.length; i++) {
            for (int j = 0; j < waterStart.length; j++) {
                int a = Math.max(landStart[i], 0) + landDuration[i];
                int b = Math.max(waterStart[j], a) + waterDuration[j];
                res = Math.min(res, b);
                
                int c = Math.max(waterStart[j], 0) + waterDuration[j];
                int d = Math.max(landStart[i], c) + landDuration[i];
                res = Math.min(res, d);
            }
        }
        return res;
    }
}
