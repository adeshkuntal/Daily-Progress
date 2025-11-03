// Last updated: 11/3/2025, 8:01:45 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i = 0;
        int res = 0;
        while (i < colors.length() - 1) {
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                if (neededTime[i] < neededTime[i + 1]) {
                    res += neededTime[i];
                } 
                else {
                    res += neededTime[i + 1];
                    neededTime[i + 1] = neededTime[i];
                }
            }
            i++;
        }
        return res;
    }
}
