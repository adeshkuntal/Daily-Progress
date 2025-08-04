// Last updated: 8/4/2025, 6:57:01 PM
class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // starting n-k
        Reverse(arr,0,n-k-1);
        //last ke k reverse karo
        Reverse(arr,n-k,n-1);
        //all elements reverse kro
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr ,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }  
    }
}