// Last updated: 8/4/2025, 6:51:18 PM
class Solution {
    public int findLucky(int[] arr) {
        int l = -1;
        int count = 0;
        Arrays.sort(arr);
        int a = arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]==a){
                count++;
            }
            else {
                if(count==a){
                    l = Math.max(l, a);
                }
                count = 1;
                a = arr[i];
            }
        }
        
        if(count == a){
            l = Math.max(l, a);
        }

        return l;
    }
}