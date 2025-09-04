// Last updated: 9/4/2025, 7:17:05 PM
class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        matrix[i][j] = Math.min(matrix[i - 1][j - 1],
                                       Math.min(matrix[i - 1][j], matrix[i][j - 1])) + 1;
                    }
                    count += matrix[i][j];
                }
            }
        }
        return count;
    }
}
