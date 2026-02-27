// Last updated: 2/27/2026, 8:48:52 PM
1class Solution {
2    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
3        int[] start = new int[flowers.length];
4        int[] end = new int[flowers.length];
5
6        
7        for(int i = 0;i < flowers.length;i++){
8            start[i] = flowers[i][0];
9            end[i] = flowers[i][1]+1;
10        }
11        Arrays.sort(start);
12        Arrays.sort(end);
13
14        int[] ans = new int[people.length];
15
16        for(int i = 0;i < people.length;i++){
17            int before = check(start,people[i]);
18            int after = check(end,people[i]);
19
20            ans[i] = before - after;
21        }
22
23        return ans;
24    }
25
26    private int check(int[] nums, int target){
27        int lo = 0, hi = nums.length;
28
29        while(lo < hi){
30            int mid = lo + (hi-lo) / 2;
31
32            if(nums[mid] <= target){
33                lo = mid+1;
34            }
35            else{
36                hi = mid;
37            }
38        }
39
40        return lo;
41    }
42}