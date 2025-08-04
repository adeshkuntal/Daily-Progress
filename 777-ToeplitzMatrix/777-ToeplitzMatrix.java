// Last updated: 8/4/2025, 6:53:34 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int col = 0; col < cols; col++) {
            if (!isDiagonalToeplitz(matrix, 0, col)) {
                return false;
            }
        }
        for (int row = 1; row < rows; row++) {
            if (!isDiagonalToeplitz(matrix, row, 0)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isDiagonalToeplitz(int[][] matrix, int row, int col) {
        int value = matrix[row][col];
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        while (row < rows && col < cols) {
            if (matrix[row][col] != value) {
                return false;
            }
            row++;
            col++;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };
        System.out.println(sol.isToeplitzMatrix(matrix1));
        
        int[][] matrix2 = {
            {1, 2},
            {2, 2}
        };
        System.out.println(sol.isToeplitzMatrix(matrix2));
    }
}
