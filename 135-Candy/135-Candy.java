// Last updated: 10/1/2025, 10:47:34 AM
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=0; i<n-1; i++){
            if(ratings[i+1] > ratings[i]){
                right[i+1] =right[i]+1;
            }
        }
        for(int i=n-1; i>0; i--){
            if(ratings[i-1] > ratings[i]){
                left[i-1] =left[i]+1;
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.max(left[i],right[i]);
        }


        return sum;
    }
}