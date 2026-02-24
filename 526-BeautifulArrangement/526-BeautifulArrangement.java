// Last updated: 2/24/2026, 10:03:30 PM
1import java.util.*;
2
3class Solution { 
4    int count = 0;
5
6    public int countArrangement(int n) {
7        int[] arr = new int[n];
8        for (int i = 0; i < n; i++) {
9            arr[i] = i + 1;
10        }
11        find_pre(arr, new ArrayList<>(), new boolean[n]);
12        return count;
13    }
14
15    public void find_pre(int[] arr, List<Integer> temp, boolean[] used) {
16        if (temp.size() == arr.length) {
17            count++;
18            return;
19        }
20
21        int pos = temp.size() + 1;
22
23        for (int i = 0; i < arr.length; i++) {
24            if (used[i]) continue;
25
26            if (arr[i] % pos == 0 || pos % arr[i] == 0) {
27                used[i] = true;
28                temp.add(arr[i]);
29                find_pre(arr, temp, used);
30                temp.remove(temp.size() - 1);
31                used[i] = false;
32            }
33        }
34    }
35}