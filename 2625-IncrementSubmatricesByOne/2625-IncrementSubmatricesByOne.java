// Last updated: 11/22/2025, 1:17:36 PM
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] arr = new int[n][n];
        for(int i=0; i<queries.length; i++){
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];
            for(int j=row1; j<=row2; j++){
                for(int k=col1; k<=col2; k++){
                    arr[j][k] = arr[j][k] + 1;
                }
            }
        }
        return arr;
    }
}
