// Last updated: 3/29/2026, 10:56:13 AM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] arr1 = s1.toCharArray();
4        char[] arr2 = s2.toCharArray();
5        if(arr1[0] != arr2[0]){
6            char ch = arr1[0];
7            arr1[0] = arr1[2];
8            arr1[2] = ch;
9        }
10        if(arr1[1] != arr2[1]){
11            char ch = arr1[1];
12            arr1[1] = arr1[3];
13            arr1[3] = ch;
14        }
15        String str1 = Arrays.toString(arr1);
16        String str2 = Arrays.toString(arr2);
17
18        return str1.equals(str2);
19    }
20}