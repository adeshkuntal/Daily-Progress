// Last updated: 2/25/2026, 7:30:55 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] s) {
5        HashMap<String, List<String>> map = new HashMap<>();
6        for (int i = 0; i < s.length; i++) {
7            char[] arr = s[i].toCharArray();
8            Arrays.sort(arr);
9            String x = new String(arr);
10            
11            if (!map.containsKey(x)) {
12                map.put(x, new ArrayList<>());
13            }
14            
15            map.get(x).add(s[i]);
16        }
17        
18        List<List<String>> res = new ArrayList<>();
19        
20        for (List<String> list : map.values()) {
21            res.add(list);
22        }
23        
24        return res;
25    }
26}