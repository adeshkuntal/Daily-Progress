// Last updated: 1/21/2026, 12:10:16 PM
1class Solution {
2    public int getXORSum(int[] nums1, int[] nums2) {
3        int xor1 = 0;
4        int xor2 = 0;
5        for(int i = 0; i < nums1.length; i++){
6            xor1 ^= nums1[i];
7        }
8        for(int i = 0; i < nums2.length; i++){
9            xor2 ^= nums2[i];
10        }
11
12        
13        return xor1 & xor2;
14    }
15}
16