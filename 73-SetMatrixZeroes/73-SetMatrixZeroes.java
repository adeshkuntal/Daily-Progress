// Last updated: 9/29/2025, 2:41:58 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> l = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    l.add(new int[] {i,j});
                }
            }
        }


        for(int k=0; k<l.size(); k++){
            int[] arr = l.get(k);
            for(int i=0; i<matrix.length; i++){
                matrix[i][arr[1]] = 0;
            }
            for(int i=0; i<matrix[0].length; i++){
                matrix[arr[0]][i] = 0;
            }
            
        }


    }
}