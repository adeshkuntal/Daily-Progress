// Last updated: 2/24/2026, 9:34:30 PM
1import java.util.*;
2
3class Solution {
4    public int threeSumClosest(int[] arr, int t) {
5        Arrays.sort(arr);
6        int n = arr.length;
7        int current = arr[0] + arr[1] + arr[2];
8
9        for(int i = 0; i < n - 2; i++){
10            int l = i + 1;
11            int r = n - 1;
12
13            while(l < r){
14                int sum = arr[i] + arr[l] + arr[r];
15
16                if(Math.abs(sum - t) < Math.abs(current - t)){
17                    current = sum;
18                }
19
20                if(sum < t){
21                    l++;
22                }
23                else if(sum > t){
24                    r--;
25                }
26                else{
27                    return sum;
28                }
29            }
30        }
31
32        return current;
33    }
34}