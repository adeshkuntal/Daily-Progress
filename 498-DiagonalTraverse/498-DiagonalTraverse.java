// Last updated: 8/25/2025, 7:26:04 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[0];
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int r = 0, c = 0, dir = 1, idx = 0;
        while (idx < m * n) {
            res[idx++] = mat[r][c];
            if (dir == 1) {
                if (c == n - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
