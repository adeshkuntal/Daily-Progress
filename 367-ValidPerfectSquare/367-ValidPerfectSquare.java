// Last updated: 9/28/2025, 8:35:25 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low <= high){
            long mid = low + (high - low)/2;
            long sq = mid * mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                low = (int)mid + 1;
            }
            else{
                high = (int)mid - 1;
            }
        }
        return false;
    }
}
