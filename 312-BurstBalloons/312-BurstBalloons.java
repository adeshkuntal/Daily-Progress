// Last updated: 9/18/2025, 12:23:08 PM
class Solution {
    public int maxCoins(int[] nums) {
        int a[]=new int[nums.length+2];
        a[0]=a[a.length-1]=1;
        for(int i=1;i<a.length-1;i++){
            a[i]=nums[i-1];
        }
        int[][] dp=new int[a.length][a.length];
        return Burst(a,0,a.length-1,dp);
    }
    public static int Burst(int[] a,int i,int j,int[][] dp){
        if(i+1==j)return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int ans=Integer.MIN_VALUE;
        for(int k=i+1;k<j;k++){
            int left=Burst(a,i,k,dp);
            int right=Burst(a,k,j,dp);
            int self=a[i]*a[j]*a[k];
            ans=Math.max(ans,left+right+self);
        }
        return dp[i][j]=ans;
    }
}