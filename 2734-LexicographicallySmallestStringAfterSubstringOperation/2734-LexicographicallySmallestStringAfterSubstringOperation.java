// Last updated: 12/24/2025, 6:53:44 PM
1class Solution {
2    public String smallestString(String s) {
3        char[] arr = s.toCharArray();
4        int i = 0;
5
6        while (i < arr.length && arr[i] == 'a') {
7            i++;
8        }
9
10        if (i == arr.length) {
11            arr[arr.length - 1] = 'z';
12            return new String(arr);
13        }
14
15        while (i < arr.length && arr[i] != 'a') {
16            arr[i] = prev(arr[i]);
17            i++;
18        }
19
20        return new String(arr);
21    }
22
23    public static char prev(char c) {
24        if (c == 'a') return 'z';
25        return (char)(c - 1);
26    }
27}
28