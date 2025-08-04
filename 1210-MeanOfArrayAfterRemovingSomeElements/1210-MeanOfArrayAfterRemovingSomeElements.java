// Last updated: 8/4/2025, 6:51:56 PM
class Solution {
    public double trimMean(int[] arr) {
         Arrays.sort(arr);
        int n = arr.length;
        int remove = n / 20; 
        int sum = 0;
        
        for (int i = remove; i < n - remove; i++) {
            sum += arr[i];
        }
        
        return (double) sum / (n - 2 * remove);
    }
}