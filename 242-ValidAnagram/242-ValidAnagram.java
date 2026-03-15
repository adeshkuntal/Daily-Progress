// Last updated: 3/15/2026, 6:18:16 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] arr1 = s.toCharArray();
4        Arrays.sort(arr1);
5        String s1 = Arrays.toString(arr1);
6        char[] arr2 = t.toCharArray();
7        Arrays.sort(arr2);
8        String s2 = Arrays.toString(arr2);
9        return s1.equals(s2);
10    }
11}