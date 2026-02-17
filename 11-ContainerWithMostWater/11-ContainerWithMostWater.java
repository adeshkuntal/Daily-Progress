// Last updated: 2/17/2026, 7:39:26 PM
1class Solution {
2    public int maxArea(int[] h) {
3        int left = 0;
4        int right = h.length-1;
5        int area = 0;
6        while(left < right){
7            int a = (right-left)*Math.min(h[left],h[right]);
8            if(a > area){
9                area = a;
10              
11            }
12            else if(h[left] < h[right]){
13                left++;
14            }
15            else{
16                right--;
17            }
18        }
19        return area;
20    }
21}