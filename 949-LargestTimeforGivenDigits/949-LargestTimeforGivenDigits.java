// Last updated: 12/21/2025, 3:16:03 PM
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        int max = -1;
4
5        for (int i = 0; i < 4; i++) {
6            for (int j = 0; j < 4; j++) {
7                for (int k = 0; k < 4; k++) {
8                    for (int l = 0; l < 4; l++) {
9                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
10                            int hour = arr[i] * 10 + arr[j];
11                            int min = arr[k] * 10 + arr[l];
12                            if (hour < 24 && min < 60) {
13                                int time = hour * 60 + min;
14                                if (time > max) {
15                                    max = time;
16                                }
17                            }
18                        }
19                    }
20                }
21            }
22        }
23
24        if (max == -1){
25            return "";
26        }
27
28        int h = max / 60;
29        int m = max % 60;
30
31        String hh = h < 10 ? "0" + h : "" + h;
32        String mm = m < 10 ? "0" + m : "" + m;
33
34        return hh + ":" + mm;
35    }
36}
37