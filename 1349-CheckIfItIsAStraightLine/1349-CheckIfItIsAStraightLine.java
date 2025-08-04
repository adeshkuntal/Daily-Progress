// Last updated: 8/4/2025, 6:51:29 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
         int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((x1 - x0) * (y - y0) != (x - x0) * (y1 - y0)) {
                return false;
            }
        }

        return true; 
    }
}