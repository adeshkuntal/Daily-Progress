// Last updated: 12/21/2025, 4:07:52 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        HashMap<Character, Integer> map = new HashMap<>();
4
5        for (int i = 0; i < a.length(); i++) {
6            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
7        }
8
9        String temp = a;
10        int count = 1;
11
12        while (temp.length() < b.length()) {
13            temp = temp + a;
14            count++;
15        }
16
17        if (temp.contains(b)) {
18            return count;
19        }
20
21        temp = temp + a;
22        count++;
23
24        if (temp.contains(b)) {
25            return count;
26        }
27
28        return -1;
29    }
30}
31