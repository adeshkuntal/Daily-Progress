// Last updated: 8/4/2025, 6:53:05 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int[][] r = new int[arr.length][arr[0].length];

        // Reverse each row
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                r[i][j] = arr[i][arr[0].length-1-j];
            }
        }
        for(int i=0; i<r.length; i++){
            for(int j=0; j<r[0].length; j++){
                if(r[i][j]==0){
                    r[i][j]=1;
                }
                else{
                    r[i][j]=0;
                }
            }
        }
        return r;
    }
}