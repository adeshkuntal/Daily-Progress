// Last updated: 10/25/2025, 4:33:35 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int area = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1'){
                    heights[j] += 1;
                }
                else{
                    heights[j] = 0;
                }
            }
            area = Math.max(area, dfs(heights));
        }
        return area;
    }

    public static int dfs(int[] heights) {
        int n = heights.length;
        int area = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                area = Math.max(area, height * width);
            }
            stack.push(i);
        }
        return area;
    }
}










// class Solution {
//     public int maximalRectangle(char[][] matrix) {
//         if (matrix == null || matrix.length == 0) return 0;
//         int m = matrix.length;
//         int n = matrix[0].length;
//         boolean[][] vis = new boolean[m][n];
//         int area = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == '1' && !vis[i][j]) {
//                     area = Math.max(area, dfs(i, j, matrix, vis));
//                 }
//             }
//         }
//         return area;
//     }

//     public static int dfs(int i, int j, char[][] matrix, boolean[][] vis) {
//         if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || vis[i][j] || matrix[i][j] != '1') {
//             return 0;
//         }
//         vis[i][j] = true;
//         int area = 1;
//         area += dfs(i - 1, j, matrix, vis);
//         area += dfs(i + 1, j, matrix, vis);
//         area += dfs(i, j - 1, matrix, vis);
//         area += dfs(i, j + 1, matrix, vis);
//         return area;
//     }
// }
