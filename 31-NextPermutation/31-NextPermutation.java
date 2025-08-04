// Last updated: 8/4/2025, 6:58:22 PM
class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int p = -1;
        int q =  -1;
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                p = i;
                break;
            }
        }
        if(p == -1){
            Reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1; i>=p ;i--){
            if(arr[i] > arr[p]){
                q = i;
                break;
            }
        }
//        swap p and q
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        Reverse(arr,p+1,n-1);
    }
    public static void Reverse(int[] arr,int i,int j) {
        while(i<j) {
            int tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
            i++;
            j--;
        } 
    }
}