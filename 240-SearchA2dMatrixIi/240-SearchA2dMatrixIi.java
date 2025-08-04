// Last updated: 8/4/2025, 6:56:28 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int item) {
        int row = 0;
        int col = arr[0].length -1;
        while (row<arr.length && col>=0){
            if(arr[row][col] == item){
                return true;
            } else if (arr[row][col] >item ) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}