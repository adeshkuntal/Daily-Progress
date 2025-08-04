// Last updated: 8/4/2025, 6:55:40 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int a = matrix.length;
        int b = matrix[0].length;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                ans.add(matrix[i][j]);
            }
        }

        Collections.sort(ans);

        return ans.get(k - 1);
    }
}