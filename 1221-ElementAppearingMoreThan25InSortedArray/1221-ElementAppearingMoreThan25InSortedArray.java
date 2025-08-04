// Last updated: 8/4/2025, 6:51:52 PM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = 0;
        double p = (double) (arr.length*25)/100;
        int count = 0;
        int a = arr[0];
        for(int i=0; i< arr.length; i++){
            if(a==arr[i]){
                count+=1;
                if(count > p){
                    max = a;
                }
            }
            else{
                count = 1;
                a=arr[i];
            }
        }
        return max;
    }
}