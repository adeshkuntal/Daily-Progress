// Last updated: 8/4/2025, 6:55:03 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
    
        int r = 0;
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==1){
                count+=1;
                r = Math.max(r, count);
            }
            else{
                count=0;
            }
        }
        return r; 
    }
}