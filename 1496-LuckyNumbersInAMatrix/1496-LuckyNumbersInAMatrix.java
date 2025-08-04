// Last updated: 8/4/2025, 6:51:21 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] min = new int[m]; 

        for (int i = 0; i < m; i++) {
            int a = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < a) {
                    a = matrix[i][j];
                }
            }
            min[i] = a;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int val = min[i];
            int colIndex = -1;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == val) {
                    colIndex = j;
                    break;
                }
            }

            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > val) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(val);
            }
        }

        return result;
    }
}
