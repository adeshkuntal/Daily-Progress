// Last updated: 2/17/2026, 7:39:58 PM
1class Solution {
2    public int maxArea(int[] h) {
3        int left = 0;
4        int right = h.length-1;
5        int area = 0;
6        while(left < right){
7            int a = (right-left)*Math.min(h[left],h[right]);
8            if(a > area){
9                area = a;
10            }
11            else if(h[left] < h[right]){
12                left++;
13            }
14            else{
15                right--;
16            }
17        }
18        return area;
19    }
20}