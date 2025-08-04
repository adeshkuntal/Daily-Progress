// Last updated: 8/4/2025, 6:52:08 PM
class Solution {
    public boolean isBoomerang(int[][] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[1][1] - arr[0][1]) * (arr[2][0] - arr[0][0]) != 
                (arr[2][1] - arr[0][1]) * (arr[1][0] - arr[0][0])) {
                flag = true;
            } else {
                flag = false;
            }
        }

        return flag;
    }
}
