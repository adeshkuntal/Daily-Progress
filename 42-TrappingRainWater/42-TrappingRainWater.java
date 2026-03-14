// Last updated: 3/14/2026, 3:54:22 PM
1class Solution {
2    public int trap(int[] height) {
3        //to find the store water we can find left max and right max then find min between these two and minus height of current pillar
4        int n = height.length;
5        int[] leftMax = new int[n];
6        int[] rightMax = new int[n];
7
8        leftMax[0] = height[0];
9        for(int i=1;i<n;i++){
10            leftMax[i] = Math.max(leftMax[i-1], height[i]);
11        }
12
13        rightMax[n-1] = height[n-1];
14        for(int i=n-2;i>=0;i--){
15            rightMax[i] = Math.max(rightMax[i+1], height[i]);
16        }
17
18        int ans = 0;
19        for(int i=0; i<n; i++){
20            ans += Math.min(leftMax[i],rightMax[i])-height[i];
21        }
22
23        return ans;
24    }
25}