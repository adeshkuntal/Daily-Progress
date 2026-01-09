// Last updated: 1/9/2026, 9:09:39 PM
1class Solution {
2    public int lengthOfLIS(int[] arr) {
3        int[] lis = new int[arr.length];
4        Arrays.fill(lis,1);
5        for(int i=1; i<arr.length; i++){
6            for(int j=i-1; j>=0; j--){
7                if(arr[j] < arr[i]){
8                    lis[i] = Math.max(lis[i] , lis[j]+1);
9                }
10            }
11        }
12
13        int max = lis[0];
14        for(int i=1; i<lis.length; i++){
15            max = Math.max(max,lis[i]);
16        }
17
18        return max;
19    }
20}