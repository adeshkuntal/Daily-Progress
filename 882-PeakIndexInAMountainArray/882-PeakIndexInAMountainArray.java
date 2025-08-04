// Last updated: 8/4/2025, 6:53:00 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max_n = 0;
        int r = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max_n){
                max_n = arr[i];
                r = i;
            }
        }
        return r;
    }
}