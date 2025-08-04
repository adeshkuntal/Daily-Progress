// Last updated: 8/4/2025, 6:56:09 PM
class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int a = arr[0];
        int ans = -1;
        for(int i=1; i< arr.length; i++){
            if(arr[i] == a){
                count+=1;
                if(count == 1){
                    ans = a;
                }
            } else {
                a = arr[i];
                count = 0;
            }
        }
        return ans; 
    }
}