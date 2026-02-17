// Last updated: 2/17/2026, 7:48:22 PM
1import java.util.Arrays;
2
3class Solution { 
4    public int longestConsecutive(int[] nums) {
5        if(nums.length == 0) return 0;
6
7        Arrays.sort(nums);
8
9        int count = 1;
10        int len = 1;
11        int x = nums[0];
12
13        for(int i = 1; i < nums.length; i++){
14            if(nums[i] == x){
15                continue;
16            }
17            else if(nums[i] == x + 1){
18                count++;
19                x = nums[i];
20            }
21            else{
22                len = Math.max(len, count);
23                x = nums[i];
24                count = 1;
25            }
26        }
27
28        len = Math.max(len, count);
29        return len;
30    }
31}
32