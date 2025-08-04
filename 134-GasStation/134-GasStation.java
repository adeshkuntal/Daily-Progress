// Last updated: 8/4/2025, 6:57:22 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for (int i = 0; i < cost.length; i++) {
            total += gas[i] - cost[i];
        }
        if (total < 0) {
            return -1;
        }
        int index = 0;
        int fuel = 0;
        for (int i = 0; i < cost.length; i++) {
            fuel += gas[i] - cost[i];
            if (fuel < 0) {
                fuel = 0;
                index = i + 1;
            }
        }
        return index;
    }
}