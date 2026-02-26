// Last updated: 2/26/2026, 10:15:17 PM
1import java.util.*;
2
3class Solution {
4    public int maximumBags(int[] cap, int[] rock, int addRocks) {
5        int n = cap.length;
6        int[] remain = new int[n];
7        
8        for(int i = 0; i < n; i++){
9            remain[i] = cap[i] - rock[i];
10        }
11        
12        Arrays.sort(remain);
13        
14        int count = 0;
15        
16        for(int i = 0; i < n; i++){
17            if(remain[i] == 0){
18                count++;
19            }
20            else if(addRocks >= remain[i]){
21                addRocks -= remain[i];
22                count++;
23            }
24            
25        }
26        
27        return count;
28    }
29}