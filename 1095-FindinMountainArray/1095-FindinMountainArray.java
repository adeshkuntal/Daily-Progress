// Last updated: 2/3/2026, 8:40:17 PM
1class Solution {
2    public int findInMountainArray(int target, MountainArray arr) {
3        int n = arr.length();
4
5        int l = 0, r = n - 1;
6        while(l < r){
7            int mid = l + (r - l) / 2;
8            if(arr.get(mid) < arr.get(mid + 1)){
9                l = mid + 1;
10            } else {
11                r = mid;
12            }
13        }
14        int peak = l;
15
16        l = 0;
17        r = peak;
18        while(l <= r){
19            int mid = l + (r - l) / 2;
20            int val = arr.get(mid);
21            if(val == target) return mid;
22            if(val < target) l = mid + 1;
23            else r = mid - 1;
24        }
25
26        l = peak + 1;
27        r = n - 1;
28        while(l <= r){
29            int mid = l + (r - l) / 2;
30            int val = arr.get(mid);
31            if(val == target) return mid;
32            if(val > target) l = mid + 1;
33            else r = mid - 1;
34        }
35
36        return -1;
37    }
38}
39